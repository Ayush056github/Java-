//  Lowest Common Ancestor // 

class Solution {
    public TreeNode lCA(TreeNode root, TreeNode p, TreeNode q) {

      if(root == null) {
        return null;
      }

      if(p.val < root.val && q.val < root.val){
        return lca(root.left,p,q);
      }
      else  if(p.val > root.val && q.val > root.val){
        return lca(root.righ,p,q);
      } else {[
        return root ;
      }
    }
}
