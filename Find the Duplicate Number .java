// 

class Solution {
    public int findDuplicate(int[] nums) {
        int first = 0 ;
        int Second = 0 ;

        do{
            first = nums[first];
            Second = nums[nums[Second]];


        } while(first!=Second);

        first = 0;
        while(first!=Second){

            first = nums[first];
            Second = nums[Second];
        }


        return first;


    }


}
