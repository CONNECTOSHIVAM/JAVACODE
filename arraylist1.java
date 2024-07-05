
import java.util.*;

public class arraylist1 {
    
    public static void main(String[] args) {
        
        ArrayList al1= new ArrayList();
        al1.add(100);
        al1.add(6);
        al1.add("radha");
        al1.add("krishna");
        System.out.println(al1);

        ArrayList al2= new ArrayList();
        al2.add(76);
        al2.add("chant");
        al2.add(9.876);
        al2.add("radhe radhe");
        System.out.println(al2);

        al2.addAll(al1);
        System.out.println(al2);

        al2.add(2,"Jai Siya Ram ");
        System.out.println(al2);
    }
}
