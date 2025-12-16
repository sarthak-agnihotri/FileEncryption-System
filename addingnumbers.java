import java.util.*;
public class addingnumbers{
    public static void main(String[] args){
        Scanner Obj=new Scanner(System.in);
        int n1,n2,s;
        System.out.print("Enter two numbers: ");
        n1=Obj.nextInt();
        n2=Obj.nextInt();
        s=n1+n2;
        System.out.println("Sum of two numbers is: "+s);
    }
}