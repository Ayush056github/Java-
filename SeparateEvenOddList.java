// 
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] projectIds = new int[n];

        
        for (int i = 0; i < n; i++) {
            projectIds[i] = sc.nextInt();
        }

        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();

        
        for (int id : projectIds) {
            if (id % 2 == 0) {
                evenList.add(id);
            } else {
                oddList.add(id);
            }
        }

        
        for (int id : evenList) {
            System.out.print(id + " ");
        }

     
        for (int id : oddList) {
            System.out.print(id + " ");
        }
    }
}
// 
