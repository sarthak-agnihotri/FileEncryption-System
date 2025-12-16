import java.util.*;
public class Swapping {
    public static void main(String[] args) {
        Scanner swap=new Scanner(System.in);
        int n1,n2,temp;
        System.out.print("Enter first number: ");
        n1=swap.nextInt();
        System.out.print("Enter second number: ");
        n2=swap.nextInt();
        temp=n1;
        n1=n2;
        n2=temp;
        System.out.println("Swapping numbers are: "+n1+" "+n2);
    }
}
