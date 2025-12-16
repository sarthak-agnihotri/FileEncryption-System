import java.util.*;
public class string {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String st;
        int i,l,lc=0,uc=0,di=0,sp=0;
        char ch;
        System.out.println("Enter your string: ");
        st=obj.nextLine();
        l=st.length();
        for(i=0;i<l;i++){
            ch=st.charAt(i);
            if(ch>='a'&&ch<='z'){
                lc++;
            }
            else if(ch>='A'&&ch<='Z'){
                uc++;
            }
            else if(ch>='0'&&ch<='9'){
                di++;
            }
            else{
                sp++;
            }
        }
        System.out.println("Number of lowercase is: "+lc);
        System.out.println("Number of lowercase is: "+uc);
        System.out.println("Number of lowercase is: "+di);
        System.out.println("Number of lowercase is: "+sp);
    }
}
