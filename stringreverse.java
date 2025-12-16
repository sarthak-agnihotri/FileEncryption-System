import java.util.*;
public class stringreverse {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String st,st2="";
        int i,l;
        char ch;
        System.out.println("Enter your string: ");
        st=obj.nextLine();
        l=st.length();
        for(i=0;i<l;i++){
            ch=st.charAt(i);
            st2=ch+st2;
        }
        System.out.println(st2);
    }
}
