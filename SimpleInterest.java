import java.util.*;
public class SimpleInterest {
   public static void main(String[] args) {
    Scanner SI=new Scanner(System.in);
    int p,r,t;
    float si;
    System.out.print("Enter principle amount: ");
    p=SI.nextInt();
    System.out.print("Enter rate interest: ");
    r=SI.nextInt();
    System.out.print("Enter time: ");
    t=SI.nextInt();
    si=(p*r*t)/100;
    System.out.println("Simple Interest is: "+si);
   } 
}
