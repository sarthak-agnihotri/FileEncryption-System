import java.util.*;
import java.lang.*;
public class Sumofseries {
    double series(int n, int m) {
        int i, f = 1;
        double s = 0.0; 
        for (i = 1; i <= m; i++) {
            f *= i;
            s += Math.pow(n, i) / (double) f;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Sumofseries ob = new Sumofseries();
        int num, n1;
        System.out.print("Enter a number: ");
        num = obj.nextInt();
        System.out.print("Enter an exponent: ");
        n1 = obj.nextInt();
        double c = ob.series(num, n1);
        System.out.println("Sum of series is: " + c);
    }
}