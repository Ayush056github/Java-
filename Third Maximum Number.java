// 
import java.util.*;

class Solution {
  public int thirdmax(int [] nums){

  Arrays.sort(nums);

  int tmax =1 ;

  for(int i = nums.length -2; i > = 0  ; i--){
    if(nums[i]!=nums[i+1]){
      tmax++;
    }
    if(tmax == 3 ) return nums[i];
  }
         
        }
return nums[nums.length-1];
       
        
    }
}
