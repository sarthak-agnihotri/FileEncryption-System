import java.util.Scanner;

class HcfLcm {
    int a, b;

    // Constructor to initialize a and b
    HcfLcm(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Method to calculate HCF using Euclidean algorithm
    int calculateHcf(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    // Method to calculate LCM
    int calculateLcm(int x, int y) {
        return (x * y) / calculateHcf(x, y);
    }

    // Method to print HCF and LCM
    void printHcfLcm() {
        int hcf = calculateHcf(a, b);
        int lcm = calculateLcm(a, b);
        System.out.println("HCF: " + hcf);
        System.out.println("LCM: " + lcm);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();

        HcfLcm obj = new HcfLcm(num1, num2);
        obj.printHcfLcm();
    }
}