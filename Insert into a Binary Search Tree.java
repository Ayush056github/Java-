// 
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
      if(root == null){
        return new TreeNode(val,null.null);
      }

      if(val > root.val){
        root.right = insertIntoBST(val,null,null);
      }
      else if (val < root.val){
        root.left = insertIntoBST(val,null,null);
      }else{
      }
      return root;

    }
}
// 
