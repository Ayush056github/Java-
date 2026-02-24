// 
class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BinaryTree {

    Node root;

    // Inorder Traversal (Left -> Root -> Right)
    void inorder(Node node) {
        if (node == null)
            return;

        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    // Preorder Traversal (Root -> Left -> Right)
    void preorder(Node node) {
        if (node == null)
            return;

        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    // Postorder Traversal (Left -> Right -> Root)
    void postorder(Node node) {
        if (node == null)
            return;

        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }

    // Height of Tree
    int height(Node node) {
        if (node == null)
            return 0;

        int lh = height(node.left);
        int rh = height(node.right);

        return Math.max(lh, rh) + 1;
    }

    // Count Total Nodes
    int countNodes(Node node) {
        if (node == null)
            return 0;

        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Tree creation
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.print("Inorder Traversal: ");
        tree.inorder(tree.root);

        System.out.print("\nPreorder Traversal: ");
        tree.preorder(tree.root);

        System.out.print("\nPostorder Traversal: ");
        tree.postorder(tree.root);

        System.out.println("\nHeight of Tree: " + tree.height(tree.root));
        System.out.println("Total Nodes: " + tree.countNodes(tree.root));
    }
}
