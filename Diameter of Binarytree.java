// 

class Solution{
  public int diameterOfBinaryTree(TreeNode root) {

    if(root==null){
      return 0;
  }
    int leftDiam = diameterOfBinaryTree(root.left);
    int leftHt = heigt(root.left);
    int rightDiam = diameterOfBinaryTree(root.right);
    int rightHt = heigt(root.right);

    int selfDiam = leftHt + rightHt ;

    return Math.max(selfDiam,Math.max(leftDiam , rightDiam));

  }

  public int Height( TreeNode root){
    if(root == null){
      return 0;
}
    return Math.max(height(root.left),height(root.right))+1;
  }
}

