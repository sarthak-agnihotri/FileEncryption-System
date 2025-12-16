import java.util.*;
public class phonenumber {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        long num,temp,temp1,d;
        int total=0;
        System.out.println("Enter a number: ");
        num=obj.nextLong();
        temp=num;
        while(temp!=0){
            temp/=10;
            total++;
        }
        System.out.println("total digits are: "+total);
        temp1=num;
        for(int i=total;i>0;i--){
            d=temp1%10;
            temp1/=10;
            if(i%2==0){
                System.out.print(d+" ");
            }
        }
    }
}
