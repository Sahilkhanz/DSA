
public class GPTLinkedList {

    class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    // Insert at beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Insert at specific position (1-based index)
    public void insertAtPosition(int pos, int data) {
        if (pos < 1) {
            System.out.println("Invalid position");
            return;
        }
        if (pos == 1) {
            insertAtBeginning(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 1; temp != null && i < pos - 1; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of bounds");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete at position (1-based index)
    public void deleteAtPosition(int pos) {
        if (head == null || pos < 1) {
            System.out.println("Invalid position or empty list");
            return;
        }
        if (pos == 1) {
            head = head.next;
            return;
        }
        Node temp = head;
        for (int i = 1; temp != null && i < pos - 1; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            System.out.println("Position out of bounds");
            return;
        }
        temp.next = temp.next.next;
    }

    // Iterative search
    public boolean searchIterative(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    // Recursive search
    public boolean searchRecursive(Node node, int key) {
        if (node == null) {
            return false;
        }
        if (node.data == key) {
            return true;
        }
        return searchRecursive(node.next, key);
    }

    // Iterative display
    public void displayIterative() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " → ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Recursive display
    public void displayRecursive(Node node) {
        if (node == null) {
            System.out.println("null");
            return;
        }
        System.out.print(node.data + " → ");
        displayRecursive(node.next);
    }

    // Iterative length
    public int lengthIterative() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Recursive length
    public int lengthRecursive(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + lengthRecursive(node.next);
    }

    // Iterative reverse
    public void reverseIterative() {
        Node prev = null, current = head, next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    // Recursive reverse
    public Node reverseRecursive(Node node) {
        if (node == null || node.next == null) {
            return node;
        }
        Node rest = reverseRecursive(node.next);
        node.next.next = node;
        node.next = null;
        return rest;
    }

    // Helper to start recursive calls from outside
    public void displayRecursive() {
        displayRecursive(head);
    }

    public boolean searchRecursive(int key) {
        return searchRecursive(head, key);
    }

    public int lengthRecursive() {
        return lengthRecursive(head);
    }

    public void reverseRecursive() {
        head = reverseRecursive(head);
    }

    // Main method for testing
    public static void main(String[] args) {
        GPTLinkedList list = new GPTLinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtBeginning(5);
        list.insertAtPosition(2, 15);

        System.out.println("Display Iterative:");
        list.displayIterative();

        System.out.println("Display Recursive:");
        list.displayRecursive();

        System.out.println("Search 20 (Iterative): " + list.searchIterative(20));
        System.out.println("Search 100 (Recursive): " + list.searchRecursive(100));

        System.out.println("Length (Iterative): " + list.lengthIterative());
        System.out.println("Length (Recursive): " + list.lengthRecursive());

        System.out.println("Reversing Iteratively:");
        list.reverseIterative();
        list.displayIterative();

        System.out.println("Reversing Recursively:");
        list.reverseRecursive();
        list.displayIterative();

        System.out.println("Deleting position 2:");
        list.deleteAtPosition(2);
        list.displayIterative();
    }
}
