
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreePractice {

    static class Node {

        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    //Level Order
    static void levelOrder(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            System.out.print(curr.data + " -> ");

            if (curr.left != null) {
                queue.add(curr.left);
            }
            if (curr.right != null) {
                queue.add(curr.right);
            }
        }
    }

    //Stack based indorder
    static void preOrderIterativeTraversal(Node root) {
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

    static void inOrderIterativeTraversal(Node root) {
        Stack<Node> stack = new Stack<>();
        Node curr = root;
        // stack.push(curr);

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

    //Apprach 1 using 2 satck one for tracersal and another for storing the post order
    static void postOrderIterativeTraversalApprach1(Node root) {
        Stack<Node> stacktraversal = new Stack<>();
        Stack<Node> stack = new Stack<>();

        stacktraversal.push(root);
        Node curr = root;

        while (!stacktraversal.isEmpty()) {
            curr = stacktraversal.pop();
            stack.push(curr);

            if (curr.left != null) {
                stacktraversal.push(curr.left);
            }
            if (curr.right != null) {
                stacktraversal.push(curr.right);
            }

        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop().data + " -> ");
        }

    }

    //Apprach 2 using sindle stack and using the peek()
    static void postOrderIterativeTraversalApprach2(Node root) {
        Stack<Node> stack = new Stack<>();

        Node curr = root;
        Node LastVisisted = null;

        while (!stack.isEmpty() || curr != null) {
            if (curr != null) {
                stack.push(curr);
                curr = curr.left;
            } else {
                Node peek = stack.peek();

                if (peek.right != null && LastVisisted != peek.right) {
                    curr = peek.right;

                } else {
                    System.out.print(peek.data + " -> ");
                    LastVisisted = stack.pop();
                }

            }
        }

    }

    static void preOrderRecursiveTraversal(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " -> ");
        preOrderRecursiveTraversal(root.left);
        preOrderRecursiveTraversal(root.right);
    }

    static void inOrderRecursiveTraversal(Node root) {
        if (root == null) {
            return;
        }
        inOrderRecursiveTraversal(root.left);
        System.out.print(root.data + " -> ");
        inOrderRecursiveTraversal(root.right);
    }

    static void postOrderRecursiveTraversal(Node root) {
        if (root == null) {
            return;
        }

        postOrderRecursiveTraversal(root.left);
        postOrderRecursiveTraversal(root.right);
        System.out.print(root.data + " -> ");
    }

    static Node insertNodeRecursivley(Node root, int data) {
        Node newNode = new Node(data);
        if (root == null) {
            return newNode;
        }

        if (data > root.data) {
            root.right = insertNodeRecursivley(root.right, data);
        }
        if (data < root.data) {
            root.left = insertNodeRecursivley(root.left, data);
        }
        return root;
    }

    static Node inserNodeIteratively(Node root, int data) {

        Node newNode = new Node(data);
        if (root == null) {
            return newNode;
        }

        Node parent = null;
        Node current = root;
        while (current != null) {
            parent = current;
            if (current.data > data) {
                current = current.left;
            } else if (current.data < data) {
                current = current.right;
            } else {
                return root;
            }
        }

        if (parent.data < data) {
            parent.right = newNode;
        } else {
            parent.left = newNode;
        }

        return root;
    }

    // Delete Node 
    // while deleting a node we have three scenarios 
    // node to be deletd is a 
    // 1. Leaf node
    // 2. root node
    // 3. not a leaf node
    static Node deletetNodeRecursively(Node root, int key) {
        if (root == null) {
            return null;
        }
        if (root.data > key) {
            root.left = deletetNodeRecursively(root.left, key);
        } else if (root.data < key) {
            root.right = deletetNodeRecursively(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            Node successor = findMin(root.right);
            root.data = successor.data;
            root.right = deletetNodeRecursively(root.right, successor.data);
        }
        return root;
    }

    static Node findMin(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    static Node deleteNodeIteratively(Node root, int key) {
        if (root == null) {
            return root;
        }

        Node parent = null;
        Node curr = root;

        //step 1.
        //reach to the key first 
        while (curr != null && curr.data != key) {
            parent = curr;

            if (curr.data > key) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }

        //key not found
        if (curr == null) {
            return root;
        }

        //step 2. if the key has one node 
        if (curr.left == null || curr.right == null) {
            Node child = (curr.left != null) ? curr.left : curr.right;
            // if (curr.left != null) {
            //     child = curr.left;
            // } else {
            //     child = curr.right;
            // }

            if (parent == null) {
                return child;
            }

            if (parent.left == curr) {
                parent.left = child;
            } else {
                parent.right = child;
            }
        } else {

            // step 3  if the key is the root node or has more than one node attenached to the key 
            Node successorParent = null;
            Node successor = curr.right;

            while (successor.left != null) {
                successorParent = successor;
                successor = successor.left;
            }

            curr.data = successor.data;
            // now we have to delete the duplicate successor
            if (successorParent != null) {
                if (successorParent.left == successor) {
                    successorParent.left = successor.right;
                } else {
                    successorParent.right = successor.right;
                }
            } else {
                curr.right = successor.right;
            }
        }

        return root;

    }

    static boolean isBst(Node root) {
        return isBstUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    static boolean isBstUtil(Node root, int min, int max) {

        if (root == null) {
            return true;
        }

        if (root.data <= min || root.data >= max) {

            return false;
        }
        return isBstUtil(root.left, min, root.data) && isBstUtil(root.right, root.data, max);

        // return false;
    }

    static Boolean searchRecursively(Node root, int key) {
        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        } else if (root.data > key) {
            return searchRecursively(root.left, key);
        } else {
            return searchRecursively(root.right, key);
        }

        // return false;
    }

    static boolean searchIteratively(Node root, int key) {
        if (root == null) {
            return false;
        }
        Node curr = root;
        while (curr != null) {
            if (curr.data == key) {
                return true;
            } else if (curr.data > key) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }

        return false;
    }

    static int sizeRecursively(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + sizeRecursively(root.left) + sizeRecursively(root.right);
    }

    static int sizeIteratively(Node root) {
        if (root == null) {
            return 0;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int height = 0;
        while (!q.isEmpty()) {
            Node curr = q.poll();
            height++;
            if (curr.left != null) {
                q.add(curr.left);
            }
            if (curr.right != null) {
                q.add(curr.right);
            }
        }
        return height;
    }

    static int heightRecursively(Node root) {
        if (root == null) {
            return -1;
        }
        return 1 + Math.max(heightRecursively(root.left), heightRecursively(root.right));
    }

    static int heightIterative(Node root) {
        if (root == null) {
            return -1;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int height = -1;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Node curr = q.poll();
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }

            }
            height++;
        }
        return height;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(8);
        root.right = new Node(11);
        root.left.right = new Node(9);
        root.left.left = new Node(7);
        root.right.right = new Node(14);

        //       10
        //      /  \
        //     9   11
        //    / \
        //   7   8
        insertNodeRecursivley(root, 12);
        inOrderRecursiveTraversal(root);
        System.out.println();
        inserNodeIteratively(root, 13);
        inOrderRecursiveTraversal(root);
        System.out.println();
        System.out.println();
        preOrderRecursiveTraversal(root);
        System.out.println();
        inOrderRecursiveTraversal(root);
        System.out.println();
        postOrderRecursiveTraversal(root);
        System.out.println();
        System.out.println();

        // deletetNode(root, 10);
        // inOrderRecursiveTraversal(root);
        System.out.println();

        if (isBst(root)) {
            System.out.println("Is BST");
        } else {
            System.out.println("Not a BST");
        }

        inOrderIterativeTraversal(root);
        System.out.println();
        preOrderIterativeTraversal(root);
        System.out.println();

        levelOrder(root);

        System.out.println();
        postOrderIterativeTraversalApprach1(root);
        System.out.println();
        postOrderIterativeTraversalApprach2(root);
        System.out.println();

        if (searchIteratively(root, 12)) {
            System.out.println("key found");
        } else {
            System.out.println("Not found");
        }

        deleteNodeIteratively(root, 10);
        postOrderIterativeTraversalApprach2(root);
        System.out.println();

        System.out.println("Size is recursive: " + sizeRecursively(root));
        System.out.println("Size is iterative: " + sizeIteratively(root));

        System.out.println();
        System.out.println("height of the tree recursively: " + heightRecursively(root));
        System.out.println("height of the tree iterativly: " + heightIterative(root));

    }
}
