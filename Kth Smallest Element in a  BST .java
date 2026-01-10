// 
class Solution {

    ArrayList<Integer> list = new ArrayList<>();

     void inOrder(TreeNode root){
        if(root == null){
            return ;
        }
        inOrder(root.left);
        list.add(root.val);
        inOrder(root.right);
    }
    public int kthSmallest(TreeNode root, int k) {

        inOrder(root);
        return list.get(k-1);
        
    }
}

// 
