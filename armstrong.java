import java.util.*;
import java.lang.*;
public class armstrong {
   public static void main(String[] args) {
    Scanner arm=new Scanner(System.in);
    int num,temp1,temp,i,d,r,s=0,c=0;
    System.out.print("Enter a number: ");
    num=arm.nextInt();
    temp1=num;
    while(temp1!=0){
        d=temp1%10;
        c++;
        temp1/=10;
    }
    temp=num;
    while(temp!=0){
        r=temp%10;
        s+=Math.pow(r,c);
        temp/=10;
    }
    if(s==num){
        System.out.println(num+" is an armstrong number.");
    }
    else{
        System.out.println(num+" is not an armstrong number.");
    }
   }
}
