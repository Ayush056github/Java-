// 

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();

        if(root == null) return result;

        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
      

        boolean LR = true ;

        while(!q.isEmpty()){
            int size = q.size();

            LinkedList<Integer> l = new LinkedList<>();

            for(int i = 0 ; i < size ; i++){
                TreeNode node = q.remove();

                if(LR){
                    l.add(node.val);

                }
                else {
                    l.addFirst(node.val);
                }

                if(node.left != null){q.add(node.left);}
                 if(node.right != null){q.add(node.right);}
            }

            result.add(l);
            LR=!LR;

        }

        return result ;

        
    }
}
