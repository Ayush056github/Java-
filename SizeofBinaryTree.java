import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    
    Node(int data){
        this.data = data;
        
    }   
}
public class implementation{
    public static void main(String[] args){
        
        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(2); 
        Node d = new Node(-1);
        Node e = new Node(1);
        Node f = new Node(6);
        Node g = new Node(9);
        
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        display(a);
        System.out.println();
        System.out.println(size(a));

        
        
    }
        private static int size(Node root){
        if(root == null) return 0;
        return 1+size(root.left)+size(root.right);
        
    }
    private static void display(Node root){
        if(root == null)return;
        System.out.print(root.data+" ");
        display(root.left);
        display(root.right);
        
    }
}
