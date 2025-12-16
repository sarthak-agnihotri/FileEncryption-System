import java.util.*;
public class printingnumberstowords {
   public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    String num;
    System.out.print("Enter a number: ");
    num=obj.nextLine();
    int a,c,l;
    a=num.length();
    for(int i=0;i<a;i++){
        l=num.charAt(i)-'0';
        if(l==0){
            System.out.print(" Zero");
        }
        else if(l==1){
            System.out.print(" One"); 
        }
        else if(l==2){
            System.out.print(" Two"); 
        }
        else if(l==3){
            System.out.print(" Three"); 
        }
        else if(l==4){
            System.out.print(" Four"); 
        }
        else if(l==5){
            System.out.print(" Five"); 
        }
        else if(l==6){
            System.out.print(" Six"); 
        }
        else if(l==7){
            System.out.print(" Seven"); 
        }
        else if(l==8){
            System.out.print(" Eight"); 
        }
        else if(l==9){
            System.out.print(" Nine"); 
        }
    }
   } 
}
