// 
class Solution{
    public static void swap(int nums[],int i , int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        
    }
    public void sortColors(int nums[]){
        
        int start = 0;
        int end = nums.length-1;
        int count =0;
        
        while(count<=end){
            if(count == 0 ){
                swap(nums,count,start);
                    count++;
                    start++;
                }else if(count==2){
                    swap(nums,count,end);
                        end--;
                    }else{
                        count++;
                        
                    }
                    
                }
            }
        }

// 
