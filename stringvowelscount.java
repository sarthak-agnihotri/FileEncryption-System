import java.util.*;
public class stringvowelscount{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String st;
        int i,l,v=0;
        char ch;
        System.out.println("Enter your string: ");
        st=obj.nextLine();
        l=st.length();
        for(i=0;i<l;i++){
            ch=st.charAt(i);
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||
                ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                    v++;
                }
        }
        System.out.println("Number of vowels in this string is: "+v);
    }
}
