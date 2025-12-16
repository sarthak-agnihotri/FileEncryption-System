import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner p=new Scanner(System.in);
        int n1,n2,i,j,count;
        System.out.print("Enter a number: ");
        n1=p.nextInt();
        System.out.print("Enter another number: ");
        n2=p.nextInt();
        for(i=n1;i<=n2;i++){
            count=0;
            for(j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(i+" ");
            }
        }
    }
}


// import java.util.*;
// public class prime {
//     public static void main(String[] args) {
//         Scanner p=new Scanner(System.in);
//         int n1,i,count=0;
//         System.out.print("Enter a number: ");
//         n1=p.nextInt();
//         for(i=1;i<=n1;i++){
//             if(n1%i==0){
//                 count++;
//             }
//         }
//         if(count==2){
//             System.out.println(n1+" is prime.");
//         }
//         else{
//             System.out.println(n1+" is not a prime.");
//         }
//     }
// }