import java.util.*;

public class arraydeque1 {
    
    public static void main(String[] args) {
        
        ArrayDeque ad1 = new ArrayDeque();
        ad1.add(100);
        ad1.add(200);
        ad1.add(400);

        System.out.println(ad1);
        ad1.addFirst(300);
        ad1.addLast("pw");
        System.out.println(ad1);

        ad1.offer(600);
        ad1.offer(500);
        ad1.offerLast(1);
        ad1.offerFirst(10);
        System.out.println(ad1);
    }
}
