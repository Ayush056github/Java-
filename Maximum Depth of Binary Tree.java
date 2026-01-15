// 

import java.util.Scanner ;

import java.Math;

class  Solution{
  public int maxDepth(TreeNode root){
    if(root == null){
      return 0;
    }

    int left = maxDepth(root.left);
    int right = maxDepth(root.right);

    return 1+Math.max(root.left ,  root.right) ;
  }
}
    

public static void main(String [] args){
  Scanner sc = new Scanner(System.in);

  int Number =  sc.nextInt();

  
