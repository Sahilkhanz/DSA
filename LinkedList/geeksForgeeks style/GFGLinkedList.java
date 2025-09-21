
public class GFGLinkedList {

    // Node class (static nested)
    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Insert at beginning
    static Node insertAtBeginning(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }

    // Insert at end
    static Node insertAtEnd(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            return newNode;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    // Insert at position (1-based index)
    static Node insertAtPosition(Node head, int pos, int data) {
        if (pos < 1) {
            System.out.println("Invalid position");
            return head;
        }

        if (pos == 1) {
            return insertAtBeginning(head, data);
        }

        Node temp = head;
        for (int i = 1; temp != null && i < pos - 1; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of bounds");
            return head;
        }

        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    static Node deleteAtBeginning(Node head) {
        if (head == null) {
            return null;
        }
        return head.next;
    }

    static Node deleteAtEnd(Node head) {
        if (head == null || head.next == null) {
            return null;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
        return head;
    }

    // Delete at position (1-based index)
    static Node deleteAtPosition(Node head, int pos) {
        if (head == null || pos < 1) {
            System.out.println("Invalid position or empty list");
            return head;
        }

        if (pos == 1) {
            return head.next;
        }

        Node temp = head;
        for (int i = 1; temp != null && i < pos - 1; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            System.out.println("Position out of bounds");
            return head;
        }

        temp.next = temp.next.next;
        return head;
    }

    // Search Iterative
    static boolean searchIterative(Node head, int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    // Search Recursive
    static boolean searchRecursive(Node head, int key) {
        if (head == null) {
            return false;
        }
        if (head.data == key) {
            return true;
        }
        return searchRecursive(head.next, key);
    }

    // Display Iterative
    static void displayIterative(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Display Recursive
    static void displayRecursive(Node head) {
        if (head == null) {
            System.out.println("null");
            return;
        }
        System.out.print(head.data + " -> ");
        displayRecursive(head.next);
    }

    // Length Iterative
    static int lengthIterative(Node head) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Length Recursive
    static int lengthRecursive(Node head) {
        if (head == null) {
            return 0;
        }
        return 1 + lengthRecursive(head.next);
    }

    // Reverse Iterative
    static Node reverseIterative(Node head) {
        Node prev = null, curr = head, next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    // Reverse Recursive
    static Node reverseRecursive(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node rest = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return rest;
    }

    // Main for testing
    public static void main(String[] args) {
        Node head = null;

        head = insertAtEnd(head, 10);
        head = insertAtEnd(head, 20);
        head = insertAtBeginning(head, 5);
        head = insertAtPosition(head, 2, 15);

        System.out.println("Display Iterative:");
        displayIterative(head);

        System.out.println("Display Recursive:");
        displayRecursive(head);

        System.out.println("Search 15 (Iterative): " + searchIterative(head, 15));
        System.out.println("Search 99 (Recursive): " + searchRecursive(head, 99));

        System.out.println("Length (Iterative): " + lengthIterative(head));
        System.out.println("Length (Recursive): " + lengthRecursive(head));

        System.out.println("Reversing Iteratively:");
        head = reverseIterative(head);
        displayIterative(head);

        System.out.println("Reversing Recursively:");
        head = reverseRecursive(head);
        displayIterative(head);

        System.out.println("Deleting position 2:");
        head = deleteAtPosition(head, 2);
        displayIterative(head);
    }
}
