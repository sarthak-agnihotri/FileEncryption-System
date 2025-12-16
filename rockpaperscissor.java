import java.util.*;
public class rockpaperscissor {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        Random random=new Random();
        boolean tryagain=true;
        while(tryagain){
            System.out.println("Enter move (0 for rock, 1 for paper, 2 for scissors).To exit the game, type 3: ");
            int player=obj.nextInt();
            if(player==3){
                tryagain=false;
                break;
            }
            if(player<0 || player>2){
                System.out.println("Invalid move.");
                continue;
            }
            int computermove=random.nextInt(3);
            if(player==0){
                System.out.println("Your move: rock");
                System.out.println(
                    "    _______\n" +
                    "---'   ____)\n" +
                    "      (_)\n" +
                    "      (_)\n" +
                    "      ()\n" +
                    "---.(_)\n"
                );
            }
            else if (player==1) {
                System.out.println("Your move: paper");
                System.out.println(
                    "    _______\n" +
                    "---'   ___)_\n" +
                    "          ______)\n" +
                    "          _______)\n" +
                    "         _______)\n" +
                    "---.)\n"
                );
            }
            else {
                System.out.println("Your move: scissors");
                System.out.println(
                    "    _______\n" +
                    "---'   ___)_\n" +
                    "          ______)\n" +
                    "       __________)\n" +
                    "      ()\n" +
                    "---.(_)\n"
                );
            }

            if (computermove == 0) {
                System.out.println("Computer move: rock");
                System.out.println(
                    "    _______\n" +
                    "---'   ____)\n" +
                    "      (_)\n" +
                    "      (_)\n" +
                    "      ()\n" +
                    "---.(_)\n"
                );
            }
            else if (computermove == 1) {
                System.out.println("Computer move: paper");
                System.out.println(
                    "    _______\n" +
                    "---'   ___)_\n" +
                    "          ______)\n" +
                    "          _______)\n" +
                    "         _______)\n" +
                    "---.)\n"
                );
            }
            else {
                System.out.println("Computer move: scissors");
                System.out.println(
                    "    _______\n" +
                    "---'   ___)_\n" +
                    "          ______)\n" +
                    "       __________)\n" +
                    "      ()\n" +
                    "---.(_)\n"
                );
            }
            if (player == computermove) {
                System.out.println("It's a tie!");
            }
            else if ((player == 0 && computermove == 2) ||(player == 1 && computermove == 0) ||(player== 2 && computermove == 1)){
                System.out.println("You win!");
            }
            else {
                System.out.println("You lose!");
            }
            System.out.println("Do you want to play again? (1 for yes, 0 for no): ");
            tryagain = obj.nextInt() == 1;
        }
        System.out.println("Thanks for playing!");
    }
}