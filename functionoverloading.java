import java.util.*;
public class functionoverloading {
    void num_cal(int num,char ch){
        if(ch=='s'){
            System.out.print(" Square is:"+(num*num));
        }
        else{
            System.out.print(" Cube is: "+(num*num*num));
        }
    }
    void num_cal(int n1,int n2,char ch){
        if(ch=='p'){
            System.out.print(" Product is:"+(n1*n2));
        }
        else{
            System.out.print(" Division is: "+(n1/n2));
        }
    }
    void num_cal(String s1,String s2){
        if(s1.equals(s2)){
            System.out.print(" Strings are equal.");
        }
        else{
            System.out.print(" Strings are not equal.");
        }
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        functionoverloading ob=new functionoverloading();
        int x,y,z;
        char c;
        String a,b;
        System.out.print("Enter a number: ");
        x=obj.nextInt();
        System.out.print("Enter a number: ");
        y=obj.nextInt();
        System.out.print("Enter a number: ");
        z=obj.nextInt();
        System.out.print("Enter a character: ");
        c=obj.next().charAt(0);
        System.out.print("Enter a string: ");
        a=obj.next();
        System.out.print("Enter another string: ");
        b=obj.next();
        ob.num_cal(x,c);
        ob.num_cal(y, z, c);
        ob.num_cal(a, b);
    }
}
