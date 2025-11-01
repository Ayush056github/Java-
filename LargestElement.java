// import  java.util.Scanner;

// public class LargestElement {
//     public static void main(String[] args){
//         Scanner sc = new Scanner (System.in);

//         int n = sc.nextInt();
//         int arr[] = new int[n];

//         System.out.print(" Enter an elements:"+n);

//         for(int i = 0 ; i < n ; i++){
//             arr[i] = sc.nextInt();
//         }


//         int largest = arr[0];
//         for(int i = 1 ; i < n ; i++){
//             if(arr[i] > largest){
//                 largest = arr[i];
            
//             }

//         }

//         System.out.print("Largest Element:"+largest);
//         sc.close();

//     }
// }


// class Solution {
//     public int LargestElement(int[] nums){
//         int largest =  nums[0];
//         for(int i = 1 ;i<nums.length;i++){
//             if(nums[i] > largest) {
//                 largest = nums[i];

//             }
//         }
//         return largest;

//     }
//     public static void main(String[] args){
//         Solution obj  = new Solution();

//         int[] nums1 = { 1,2,3,45,54};
//         System.out.print("Enter the number of Element:"+obj.LargestElement(nums1));

//         int[] nums2 = { 1,22,90,45,54};
//         System.out.print("Enter the number of Element:"+obj.LargestElement(nums2));

//     }
// }    


 