import java.util.*;
public class palindromeusingfunction {
    int check(int n){
        int temp,d,m=0;
        temp=n;
        while(temp!=0){
            d=temp%10;
            m=m*10+d;
            temp/=10;
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
        palindromeusingfunction ob=new palindromeusingfunction();
        int num,c;
        System.out.print("Enter a number: ");
        num=obj.nextInt();
        c=ob.check(num);
        if(c==1){
            System.out.println(num+" is a palindrome.");
        }
        else{
            System.out.println(num+" is not a palindrome.");
        }
    }
}
