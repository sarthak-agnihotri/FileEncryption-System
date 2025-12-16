import java.util.*;
public class stringphonenumber {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String num;
        System.out.print("Enter a number: ");
        num=obj.next();
        int first,last,l;
        l=num.length();
        first=Integer.parseInt(num.charAt(0));
        last=Integer.parseInt(num.charAt(9));
        System.out.print(+first);
        System.out.print(+last);
        int sum=first+last;
        int product=first*last;
        System.out.print("Sum is: "+sum);
        System.out.print("Product is: "+product);
    }
}