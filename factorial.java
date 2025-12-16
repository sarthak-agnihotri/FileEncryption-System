import java.util.*;
public class factorial {
   public static void main(String[] args) {
    Scanner fact=new Scanner(System.in);
    int num,f=1,i;
    System.out.println("Enter a number: ");
    num=fact.nextInt();
    for(i=1;i<=num;i++){
        f*=i;
    }
    System.out.println("Factorial of "+num+" is " +f);
   } 
}