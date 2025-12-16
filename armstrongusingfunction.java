import java.util.*;
import java.lang.*;
public class armstrongusingfunction {
    int check(int n){
        int i,d,temp,r,m=0,count=0;
        temp=n;
        while(temp!=0){
            d=temp%10;
            count++;
            temp/=10;
        }
        int temp1=n;
        while(temp1!=0){
            r=temp1%10;
            m+=Math.pow(r,count);
            temp1/=10;
        }
        if(m==n){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        armstrongusingfunction ob=new armstrongusingfunction();
        int num,c;
        System.out.print("Enter a number: ");
        num=obj.nextInt();
        c=ob.check(num);
        if(c==1){
            System.out.println(num+" is an armstrong.");
        }
        else{
            System.out.println(num+" is not an armstrong.");
        }
    }
}