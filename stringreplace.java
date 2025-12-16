import java.util.*;
public class stringreplace {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String st;
        int i,l;
        char ch;
        System.out.println("Enter your string: ");
        st=obj.nextLine();
        l=st.length();
        for(i=0;i<l;i++){
            ch=st.charAt(i);
            if(ch=='e'){
                ch='*';
            }
            System.out.print(ch);
        }
        System.out.println();
    }
}
