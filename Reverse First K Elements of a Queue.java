// 
import java.util.*;
import  java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k =  sc.nextInt();
    Queue<Integer> q = new LinkedList<>();
    Stack<Integer> st = new Stack<>();
    

    for(int i =0;i<n;i++){
      q.add(sc.nextInt());
    }
    for(int i =0;i<k;i++){
      st.push(q.remove());
    }
    while(!st.isEmpty()) q.add(st.pop());

    for(int i =0;i<n-k;i++){
      q.add(q.remove());;
      
    }
    for(int x : q) System.out.print(x+" ");
  }
}
