// 
import java.util.*;

class Solution {
    public ArrayList<Integer> nextSmallerElement(int[] arr) {
      Stack<Integer> stack =  new Stack<>();
      ArrayList<Integer> ans = new ArrayList<>();

      int n - arr.length;
      int [] res = new int [n];

      for(int i = n-1;i>=0;i--){
   while(!stack.isEmpty() && stack.peek()>=arr[i]){
                stack.pop();
            }
        if (stack.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = stack.peek();
            }

            stack.push(arr[i]);
        }

        for (int x : res) {
            ans.add(x);
        }

        return ans;
    }
}
