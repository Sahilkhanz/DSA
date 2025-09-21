
public class BST {

    static class Node {

        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static Node inOrderTraversal(Node root) {
        if (root == null) {
            return null;
        }
        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
        return root;
    }

    static boolean isBST(Node root) {
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

    static Node binarySearchTreeRecursive(Node root, int key) {
        if (root == null) {
            return null;
        }
        if (root.data == key) {
            return root;
        } else if (key < root.data) {
            return binarySearchTreeRecursive(root.left, key);
        } else if (key > root.data) {
            return binarySearchTreeRecursive(root.right, key);
        }
        return null;
    }

    static Node binarySearchTreeIterative(Node root, int key) {
        while (root != null) {
            if (root.data == key) {
                return root;
            } else if (key < root.data) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return null;
    }

    static void insertNode(Node root, int key) {
        Node pre = null;
        Node newNode = new Node(key);

        while (root != null) {
            pre = root;
            if (root.data == key) {
                return;
            } else if (key < root.data) {
                root = root.left;
            } else {
                root = root.right;
            }
        }

        if (key < pre.data) {
            pre.left = newNode;
        } else {
            pre.right = newNode;
        }
    }

    static Node deleteNode(Node root, int key) {
        if (root == null) {
            return null;
        }

        if (key < root.data) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.data) {
            root.right = deleteNode(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            Node successor = findMin(root.right);
            root.data = successor.data;
            root.right = deleteNode(root.right, successor.data);

        }
        return root;
    }

    static Node findMin(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(8);
        root.right = new Node(12);
        root.left.left = new Node(7);
        root.left.right = new Node(9);
        root.right.left = new Node(11);
        root.right.right = new Node(13);

        //           10
        //         /    \
        //        /      \
        //      08       12 
        //     /  \     /  \
        //    7    9   11  13
        inOrderTraversal(root);
        System.err.println("");

        if (isBST(root)) {
            System.out.println("Yes! the given binary tree is a BST");
        } else {
            System.out.println("No! the given binary tree is not a BST");
        }

        Node keyFound1 = binarySearchTreeRecursive(root, 7);
        if (keyFound1 != null) {
            System.out.println("Key Found: " + keyFound1.data);
        } else {
            System.out.println("key not found");
        }

        Node keyFound2 = binarySearchTreeIterative(root, 11);
        if (keyFound2 != null) {
            System.out.println("Key Found: " + keyFound2.data);
        } else {
            System.out.println("Key not found");
        }

        insertNode(root, 14);
        insertNode(root, 15);
        insertNode(root, 11);
        insertNode(root, 6);
        inOrderTraversal(root);
        deleteNode(root, 12);
        deleteNode(root, 10);
        System.err.println("");
        inOrderTraversal(root);
    }
}
