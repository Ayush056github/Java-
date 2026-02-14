// 
import java.util.*;


class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
      ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
      if(root == null){
        return ans;
      }
      Queue<Node> queue = new LinkedList<>();
      queue.offer(root);

  while(!queue.isEmpty()){
    int size = queue.size();
    ArrayList<Integer>Level = new LinkedList<>();


      for(int i  = 0 ;i<size;i++){
        Node node = queue.poll();
        level.add(node.data);
      }
    if(node.left!=null){
      queue.offer(node.left);
    }
    if(node.right!=null){
      queue.offer(node.right);
    }
  }
      return ans;
    }
}
