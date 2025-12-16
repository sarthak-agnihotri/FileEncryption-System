import java.util.*;
public class vector {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        Vector list=new Vector();

        list.addElement("Sarthak");
        list.addElement("Shyam");
        list.addElement("Ram");
        list.addElement("Sita");
        System.out.print("Add elements are: "+list);

        list.insertElementAt("Laxman", 2);
        System.out.println("After inserting: "+list);

        System.out.println("Size of a vector is: "+list.size());

        list.removeElement("Sita");
        System.out.println("After removing sita: "+list);

        list.removeElementAt(2);
        System.out.println("After removing index 2: "+list);

        list.removeAllElements();
        System.out.println("After removing all elements: "+list);
    }
}
