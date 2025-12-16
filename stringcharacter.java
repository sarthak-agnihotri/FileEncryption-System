import java.util.*;
public class stringcharacter{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        String st;
        int i,l;
        char ch;
        System.out.println("Enter your string: ");
        st=obj.next();
        l=st.length();
        for(i=0;i<l;i++){
            ch=st.charAt(i);
            System.out.println(ch);
        }
    }
}