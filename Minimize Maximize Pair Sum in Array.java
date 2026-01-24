// 
import java.util.Math;
import java.util.Scanner;
import java.util.*;

public class Solution{
   public int minPairSum(int[] nums) {
     Arrays.sort(nums);

     int max = Integer.MIN_VALUE;

       j = nums.length -1 ;
      

     for(int i = 0 ; i < nums.length / 2 ; i++){
       int pairsum = nums[i] + nums[j];

       max = Math.max(max , pairsum);
      
       j-- ;
     }
     return max ;
     
       
       
       
   }
}
