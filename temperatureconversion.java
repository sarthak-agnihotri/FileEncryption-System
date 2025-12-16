import java.util.*;
public class temperatureconversion {
    public static void main(String[] args) {
        Scanner temp=new Scanner(System.in);
        double t,k;
        System.out.print("Enter temperature in degrees: ");
        t=temp.nextDouble();
        k=t+273;
        System.out.println("Temperature in kelvin is: "+k);
    }
}
