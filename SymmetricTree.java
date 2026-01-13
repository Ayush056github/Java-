// 

import java.util.*;
import java.Scanner;

class Solution {

    public static boolean areMirror(TreeNode n1, TreeNode n2) {

      if(n1 == null && n2 == null){
        return true;
      }
      if(n1 == null || n2 == null){
        return false;
      }
      if (n1.val != n2.val) return false;  

      return areMirror(n1.left, n2.right) 
            && areMirror(n1.right, n2.left);
      

    } 
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return areMirror(root.left, root.right);  
    }
     
}
