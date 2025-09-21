
class Node {

    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Tree {

    public static Node TreeInsertion(int data) {
        Node curr = new Node(data);

        return curr;
    }

    public static void preOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");

        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public static void postOrderTraversal(Node root) {
        if (root == null) {
            return;
        }

        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data + " ");
    }

    public static void inOrderTraversal(Node root) {
        if (root == null) {
            return;
        }

        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
    }

    // recurcive
    public static boolean isBST(Node root) {
        return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    static boolean isBSTUtil(Node root, int min, int max) {
        if (root == null) {
            return true;
        }
        if (root.data <= min || root.data >= max) {
            return false;

        }
        return isBSTUtil(root.left, min, root.data) && isBSTUtil(root.right, root.data, max);
    }

    // Iterative
    

    public static void main(String[] args) {
        Node root = new Node(15);
        root.left = new Node(10);
        root.right = new Node(20);
        root.left.left = new Node(8);
        root.left.right = new Node(12);
        root.right.left = new Node(17);
        root.right.right = new Node(25);

        //        15
        //      /    \
        //    10      20
        //   /  \    /  \
        //  8   12  17  25

        preOrderTraversal(root);
        System.err.println("");
        postOrderTraversal(root);
        System.err.println("");
        inOrderTraversal(root);
        System.err.println("");

        if (isBST(root)) {
            System.out.println("Yes the given binary tree is a BST");
        } else {
            System.out.println("No the given binary tree is not a BST");
        }

    }
}
