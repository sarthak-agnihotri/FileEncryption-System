import java.util.*;
public class areaOfcircle {
   public static void main(String[] args) {
    Scanner area=new Scanner(System.in);
    int radius;
    double pi=3.14,a,c;
    System.out.print("Enter radius: ");
    radius=area.nextInt();
    a=pi*radius*radius;
    c=2*pi*radius;
    System.out.println("Area of a circle is: "+a);
    System.out.println("Circumference of a circle is: "+c);
   } 
}
