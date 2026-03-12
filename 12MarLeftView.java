// 
import java.util.*;
import java.util.Scanner;

class Node{
    int data;
    Node left,right;
    
    Node(int data){
        this.data=data;
        this.left =right= null;
        
        
    }
}
public class Main{
    static Node insert(Node root , int val){
       if(root == null){
    return new Node(val);
}

if(val < root.data){
    root.left = insert(root.left, val);
}else{
    root.right = insert(root.right, val);
}
        return root;
    }
    static void leftView(Node root){
        if(root == null) return ;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0 ; i<size;i++){
                Node curr = q.poll();
                
                if(i==0)
                System.out.println(curr.data);
                if(curr.left!=null)
                q.add(curr.left);
                if(curr.right!=null)
                q.add(curr.right);
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        Node root =  null;
        
        for(int i=0;i<n;i++){
            root = insert(root,sc.nextInt());
        }
        leftView(root);
    }
}
