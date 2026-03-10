// 
import java.util.*;

class Node{
    int data;;
    Node left , right ;
    
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
            
        }
}
public class Main{
    static Node insert(Node root , int data ){
        if(root  == null) return new Node(data);
    if (data < root.data)
            root.left = insert(root.left, data);
        else
            root.right = insert(root.right, data);

        return root;
    }
    static void postorder(Node root) {
        if (root == null)
            return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Node root = null;

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            root = insert(root, val);
        }

        postorder(root);
    }

}
