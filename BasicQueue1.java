// 
import java.util.*;
import java.util.Queue;

public class Solution{
  public static void main(String[] args){
    Queue<Integer> q = new LinkedList<>();
    q.add(10);
    q.add(20);
    q.add(30);
    q.add(40);

  System.out.println(q);
    q.remove();

     System.out.println(q);
    q.add(10);
    
    System.out.println(q+" "+q.size()+" "+q.peek());
  }
}
