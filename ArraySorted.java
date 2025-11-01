import java.util.*;

public class ArraySorted{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] arr = new int [size];
        System.out.println("Enter the elements :");

        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        boolean sorted = true;
        for(int i=0;i<size-1;i++){
            if(arr[i] > arr[i+1]){
                sorted = false;
                break;
            }
        }
        if(sorted){
            System.out.println("Array is sorted"+sorted);
        }
        else{
            System.out.println("Array is not sorted"+sorted);
        }


    }
}