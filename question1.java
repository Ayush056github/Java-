import java.util.Arrays;

public class MoveZeroSimple {
    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 2, 3, 4};
        int[] result = new int[arr.length];

        int index = 0;

      
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                result[index] = arr[i];
                index++;
            }
        }

       
        System.out.println(Arrays.toString(result));
    }
}
