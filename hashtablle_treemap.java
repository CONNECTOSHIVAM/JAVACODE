import java.util.*;

public class hashtablle_treemap {
    
    public static void main(String[] args) {
        
        Hashtable ht = new Hashtable();
        ht.put(1,"sk");
        ht.put(5,"md");
        ht.put(3,"ym");

        ht.putIfAbsent(1, "lk");
        System.out.println(ht);

        TreeMap tm = new TreeMap();
        tm.put(3,"shivam");
        tm.put(2,"Gyan");
        tm.put(1,"shalu");

        System.out.println(tm);
    }
}
