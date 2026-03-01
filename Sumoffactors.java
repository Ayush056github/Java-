// 
import java.util.*;

public class SeparateEvenOdd {

    public static void main(String[] args) {

        int[] projectIds = {101, 202, 303, 404, 505, 606};

        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();

        for (int id : projectIds) {
            if (id % 2 == 0) {
                evenList.add(id);
            } else {
                oddList.add(id);
            }
        }

        System.out.println("Even Project IDs: " + evenList);
        System.out.println("Odd Project IDs: " + oddList);
    }
}
