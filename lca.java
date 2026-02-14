// 
import java.util.*;
import java.util.Scanner;

public class Node{
    int val;
    int left;
    int right;
    
    Node(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class Solution{
    public Node lca(Node root, Node n1,Node n2){
        if(root = null || root == n1 || root == n2){
            return root;
        }
        
        int leftsum = lca(root.left,n1,n2);
        int rightsum = lca(root.right,n1,n2);
        if(leftsum == null){
            return rightsum;
        }else if(rightsum == null){
            return leftsum;
        }else{
            return root;
        }
    }
    }
}
// 
