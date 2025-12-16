import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.text.SimpleDateFormat;

public class FileEncryptionSystem {

    private static Scanner scanner = new Scanner(System.in);

    // Function to encrypt and decrypt content using XOR
    private static String encryptDecrypt(String data, String key) {
        char[] chars = data.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] ^= key.charAt(i % key.length());
        }
        return new String(chars);
    }

    // Function to validate input length
    private static boolean validateInputLength(String input, int maxLength) {
        if (input.length() > maxLength) {
            System.err.println("Error: Input exceeds the allowed length of " + maxLength + " characters.");
            return false;
        }
        return true;
    }

    // Function for user registration
    private static void registerUser() {
        final int MAX_LENGTH = 20;
        System.out.print("Enter username (max " + MAX_LENGTH + " chars): ");
        String username = scanner.next();
        if (!validateInputLength(username, MAX_LENGTH)) return;

        System.out.print("Enter password (max " + MAX_LENGTH + " chars): ");
        String password = scanner.next();
        if (!validateInputLength(password, MAX_LENGTH)) return;

        try (FileWriter fw = new FileWriter("users.txt", true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(username + " " + password);
            bw.newLine();
            System.out.println("User registered successfully!");
        } catch (IOException e) {
            System.err.println("Error writing to users file.");
        }
    }

    // Function for user login
    private static boolean loginUser() {
        final int MAX_LENGTH = 20;
        System.out.print("Enter username (max " + MAX_LENGTH + " chars): ");
        String username = scanner.next();
        if (!validateInputLength(username, MAX_LENGTH)) return false;

        System.out.print("Enter password (max " + MAX_LENGTH + " chars): ");
        String password = scanner.next();
        if (!validateInputLength(password, MAX_LENGTH)) return false;

        try (Scanner fileScanner = new Scanner(new File("users.txt"))) {
            while (fileScanner.hasNext()) {
                String u = fileScanner.next();
                String p = fileScanner.next();
                if (u.equals(username) && p.equals(password)) {
                    System.out.println("Login successful!");
                    return true;
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Users file not found!");
        }

        System.out.println("Invalid credentials!");
        return false;
    }

    // Function to generate a 2FA OTP
    private static void generateOTP() {
        Random rand = new Random();
        int otp = rand.nextInt(10000); // 4-digit OTP
        System.out.println("Your OTP is: " + otp);
        System.out.print("Enter OTP: ");
        int enteredOTP = scanner.nextInt();
        if (enteredOTP == otp) {
            System.out.println("2FA successful!");
        } else {
            System.out.println("Invalid OTP!");
            System.exit(0);
        }
    }

    // Function to check file name validity
    private static boolean getFileName(StringBuilder filename) {
        final int MAX_FILENAME_LENGTH = 50;
        System.out.print("Enter the file name (max " + MAX_FILENAME_LENGTH + " chars): ");
        filename.append(scanner.next());
        return validateInputLength(filename.toString(), MAX_FILENAME_LENGTH);
    }

    // Function to write encrypted content to a file
    private static void writeFile(String filename, String key) {
        System.out.print("Enter content to write into the file: ");
        scanner.nextLine(); // Consume leftover newline
        String content = scanner.nextLine();
        content = encryptDecrypt(content, key);

        try (FileWriter fw = new FileWriter(filename, true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(content);
            bw.newLine();
            System.out.println("Content written and encrypted successfully!");
        } catch (IOException e) {
            System.err.println("Error: Unable to open the file for writing.");
        }
    }

    // Function to read and decrypt content from a file
    private static void readFile(String filename, String key) {
        try (Scanner fileScanner = new Scanner(new File(filename))) {
            System.out.println("Decrypted File Contents:");
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(encryptDecrypt(line, key));
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error: Unable to open the file for reading.");
        }
    }

    // Function to check file accessibility
    private static void viewFile(String filename) {
        File file = new File(filename);
        if (file.exists() && file.canRead()) {
            System.out.println("File: " + filename + " exists and is accessible.");
        } else {
            System.err.println("Error: File does not exist or cannot be opened.");
        }
    }

    // Function to display file metadata
    private static void displayMetadata(String filename) {
        File file = new File(filename);
        if (file.exists()) {
            System.out.println("File Metadata:");
            System.out.println("File Size: " + file.length() + " bytes");
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
            System.out.println("Last Modified: " + sdf.format(file.lastModified()));
        } else {
            System.err.println("Error: Unable to retrieve metadata for the file.");
        }
    }

    // Function to share a file (copy content to a new destination)
    private static void shareFile(String sourceFilename, String destinationFilename, String key) {
        try (Scanner fileScanner = new Scanner(new File(sourceFilename));
             FileWriter fw = new FileWriter(destinationFilename);
             BufferedWriter bw = new BufferedWriter(fw)) {
            System.out.println("Sharing file content...");
            while (fileScanner.hasNextLine()) {
                String line = encryptDecrypt(fileScanner.nextLine(), key);
                bw.write(line);
                bw.newLine();
            }
            System.out.println("File successfully shared to: " + destinationFilename);
        } catch (IOException e) {
            System.err.println("Error: Unable to open source or destination file for sharing.");
        }
    }

    public static void main(String[] args) {
        boolean authenticated = false;
        StringBuilder filename = new StringBuilder();
        String key = "";
        int choice;

        do {
            if (!authenticated) {
                System.out.println("\n1. Register\n2. Login\n3. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        registerUser();
                        break;
                    case 2:
                        if (loginUser()) {
                            generateOTP();
                            authenticated = true;
                            if (!getFileName(filename)) {
                                authenticated = false;
                                continue;
                            }
                            System.out.print("Enter an encryption: ");
                            key = scanner.next();
                        }
                        break;
                    case 3:
                        System.out.println("Exiting the program...");
                        System.exit(0);
                    default:
                        System.err.println("Invalid choice! Please try again.");
                }
            } else {
                System.out.println("\nAuthenticated Operations Menu:");
                System.out.println("1. Write to File (Encrypted)");
                System.out.println("2. Read File (Decrypted)");
                System.out.println("3. View File Accessibility");
                System.out.println("4. Display File Metadata");
                System.out.println("5. Share File");
                System.out.println("6. Logout");
                System.out.println("7. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        writeFile(filename.toString(), key);
                        break;
                    case 2:
                        readFile(filename.toString(), key);
                        break;
                    case 3:
                        viewFile(filename.toString());
                        break;
                    case 4:
                        displayMetadata(filename.toString());
                        break;
                    case 5:
                        System.out.print("Enter the destination file name to share the content: ");
                        String destination = scanner.next();
                        shareFile(filename.toString(), destination, key);
                        break;
                    case 6:
                        authenticated = false;
                        System.out.println("Logged out successfully.");
                        break;
                    case 7:
                        System.out.println("Exiting the program...");
                        System.exit(0);
                    default:
                        System.err.println("Invalid choice! Please try again.");
                }
            }
        } while (true);
    }
}
