

import java.util.*;

public class iterator {
    
    public static void main(String[] args) {
        
        ArrayList al = new ArrayList();
        al.add(12);
        al.add(5);
        al.add(10);
        al.add(100);
        System.out.println(al);

        //we acess all index using by iterator
        Iterator itr =al.iterator();
        while(itr.hasNext())
        {
            //Integer i = (Integer)itr.next();
            System.out.println(itr.next());
        }

        //Accessing in the downword oppositte  [ reverse ]direction.
        ListIterator itr1=al.listIterator(al.size());
        while(itr1.hasPrevious())
        {
            System.out.println(itr1.previous());
        }
    }
}
