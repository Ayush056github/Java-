// 
import java.util.*;

public class Main{
  publics static void main(String[]  args){
    int n = sc.nextInt();
    int[] arr = new int[n];

  for(int i =0;i<n;i++){
    arr[i] = sc.nextInt();
  }
    int left = 0 ;
    int right = n-1;

  if(arr[left]!=arr[right]){
  boolean isPalindrome = true;
    break;
  }
  left++;
    right--;

  if(isPalindrome){
  System.out.println("Yes");
}else{
  System.out.println("No");
}
}
}
