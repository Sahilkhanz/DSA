
import java.util.Stack;

public class Practice {

    static class Node {

        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Root -> left -> right
    static void preOrderRecursivelyTraversal(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " -> ");
        preOrderRecursivelyTraversal(root.left);
        preOrderRecursivelyTraversal(root.right);

    }

    static void preOrderIterativelyTraversal(Node root) {
        Stack<Node> stack = new Stack<>();

        stack.push(root);
        while (!stack.isEmpty()) {
            Node curr = stack.pop();
            System.out.print(curr.data + " -> ");
            if (curr.right != null) {
                stack.push(curr.right);
            }
            if (curr.left != null) {
                stack.push(curr.left);
            }
        }
    }

    // Left -> Root -> right
    static void inorderRecursivelyTraversal(Node root) {
        if (root == null) {
            return;
        }
        inorderRecursivelyTraversal(root.left);
        System.out.print(root.data + " -> ");
        inorderRecursivelyTraversal(root.right);
    }

    static void inOrderIterativeTraversal(Node root) {
        Stack<Node> stack = new Stack<>();
        // stack.push(root);
        Node curr = root;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            System.out.print(curr.data + " -> ");
            curr = curr.right;
        }
    }

    // left -> right ->Root
    static void postOrderRecursiveTraversal(Node root) {
        if (root == null) {
            return;
        }
        postOrderRecursiveTraversal(root.left);
        postOrderRecursiveTraversal(root.right);
        System.out.print(root.data + " -> ");
    }

    static void postOrderIterativeApproach1(Node root) {
        Stack<Node> traverse = new Stack<>();
        Stack<Node> stack = new Stack<>();
        traverse.push(root);

        while (!traverse.isEmpty()) {
            Node curr = traverse.pop();
            stack.push(curr);
            if (curr.left != null) {
                traverse.push(curr.left);
            }
            if (curr.right != null) {
                traverse.push(curr.right);
            }
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop().data + " -> ");
        }
    }

    static void postOrderIterativeApproach2(Node root) {
        Stack<Node> stack = new Stack<>();
        Node curr = root;
        Node lastVistsed = null;
        while (!stack.isEmpty() || curr != null) {
            if (curr != null) {
                stack.push(curr);
                curr = curr.left;
            } else {
                Node peek = stack.peek();
                if (peek.right != null && lastVistsed != peek.right) {
                    curr = peek.right;
                } else {
                    System.out.print(peek.data + " -> ");
                    lastVistsed = stack.pop();

                }
            }
        }

    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(9);
        root.left.left = new Node(7);
        root.left.right = new Node(8);
        root.right = new Node(12);
        root.right.left = new Node(11);
        root.right.right = new Node(13);

        System.out.print("Preorder Recursive -> ");
        preOrderRecursivelyTraversal(root);
        System.out.print("\nPreorder Iterative -> ");
        preOrderIterativelyTraversal(root);
        System.out.print("\nInorder Recursive  -> ");
        inorderRecursivelyTraversal(root);
        System.out.print("\nInorder Iterative  -> ");
        inOrderIterativeTraversal(root);
        System.out.print("\nPostorder Recursive-> ");
        postOrderRecursiveTraversal(root);
        System.out.print("\nPostorder Iterative-> ");
        postOrderIterativeApproach1(root);
        System.out.print("\nPostorder Iterative-> ");
        postOrderIterativeApproach2(root);
    }
}
