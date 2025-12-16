import java.util.*;
public class isbn {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String num;
        System.out.print("Enter a number: ");
        num=obj.next();
        int a,sum=0;
        for(int i=0;i<10;i++){
            a=num.charAt(i)-'0';
            sum=sum+a*(10-i);
        }
        System.out.println("Sum is: "+sum);
        if(sum%11==0){
            System.out.println("LEAVES NO REMAINDER - VALID ISBN CODE");
        }
        else{
            System.out.println("LEAVES REMAINDER - INVALID ISBN CODE");
        }
    }
}
