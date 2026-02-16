// 
import java.util.PriorityQueue;
import java.util.Collections;


public class Main{
    public static void main(String[] args){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(1);
        pq.offer(2);
         pq.offer(3);
          pq.offer(4);
           pq.offer(5);
           System.out.println(pq);
           System.out.println("The Highest Priority Should : "+pq.peek());
           System.out.println("The Deleted: "+pq.poll());
           System.out.println("The size of Priority: "+pq.size());
           System.out.println("The Contains  Known as the: "+pq.contains(5));
         System.out.println("-----------------------------------------------------");
    
   
    
   
        PriorityQueue<Integer> maxpq = new PriorityQueue<>(Collections.reverseOrder());
        maxpq.offer(1);
        maxpq.offer(2);
       maxpq.offer(3);
        maxpq.offer(4);
           maxpq.offer(5);
           System.out.println(maxpq);
           System.out.println("The Highest Priority Should : "+maxpq.peek());
           System.out.println("The Deleted: "+maxpq.poll());
           System.out.println("The size of Priority: "+maxpq.size());
           System.out.println("The Contains  Known as the: "+maxpq.contains(5));
        
    }
}
// 
