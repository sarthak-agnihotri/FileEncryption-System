import java.util.*;
public class sumavg {
    public static void main(String[] args) {
        Scanner cal=new Scanner(System.in);
        int n1,n2,n3,n4,n5,s;
        float avg;
        System.out.print("Enter first number: ");
        n1=cal.nextInt();
        System.out.print("Enter second number: ");
        n2=cal.nextInt();
        System.out.print("Enter third number: ");
        n3=cal.nextInt();
        System.out.print("Enter fourth number: ");
        n4=cal.nextInt();
        System.out.print("Enter fifth number: ");
        n5=cal.nextInt();
        s=n1+n2+n3+n4+n5;
        avg=(float)s/5;
        System.out.println("Sum of these numbers is: "+s);
        System.out.println("Average of these numbers is: "+avg);
    }
}
