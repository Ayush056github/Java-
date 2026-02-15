// 
import java.util.*;

public class FirstNonRepeating {
    public static void main(String[] args) {
        String s = "aabc";
        
        HashMap<Character, Integer> freq = new HashMap<>();
        Queue<Character> q = new LinkedList<>();

        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
            q.add(ch);

            while (!q.isEmpty() && freq.get(q.peek()) > 1) {
                q.poll();
            }

            if (q.isEmpty())
                System.out.print("-1 ");
            else
                System.out.print(q.peek() + " ");
        }
    }
}

// 
