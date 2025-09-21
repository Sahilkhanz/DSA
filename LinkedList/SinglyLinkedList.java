
// 2 Insert at beginning
// 3 Insert at end
// 4 Insert at a specific position
// 5 Delete at beginning
// 6 Delete at end
// 7 Delete at position
// 8 Search (Iterative + Recursive)
// 9 Display (Iterative + Recursive)
// 10 Reverse (Iterative + Recursive)
// 11 Length (Iterative + Recursive)
public class SinglyLinkedList {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node insertAtFront(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }

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
        newNode.next = null;
        return head;
    }

    static Node insertAtPosition(Node head, int pos, int data) {
        if (pos < 1) {
            System.out.println("Invalid position!");
        }
        if (pos == 1) {
            return insertAtFront(head, data);
        }
        Node temp = head;

        for (int i = 0; temp != null && i < pos - 1; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("OverFlow!!");
            return head;
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    static Node deleteAtFront(Node head) {
        if (head == null) {
            System.out.println("Cannot delete as it is Empty!!");
            return null;
        }
        head = head.next;
        return head;
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

    static Node deleteAtPositionNode(Node head, int pos) {
        if (pos < 1) {
            System.out.println("Invalid position!!");

        }
        if (pos == 1) {
            return deleteAtFront(head);
        }
        Node temp = head;
        for (int i = 0; temp != null && i < pos - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;

    }

    static void iterativeTraversal(Node head) {
        Node temp = head;
        // if (temp.next == null) 
        //     System.out.println("Empty!!");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    static void recursiveTraversal(Node head) {
        if (head == null) {
            return;
        }
        System.out.print(" -> " + head.data);

        recursiveTraversal(head.next);

    }

    static int lengthIterative(Node head) {
        if (head == null) {
            System.out.println("Count 0 ");
        }
        int count = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    static int lengthRecursive(Node head) {
        if (head == null) {
            return 0;
        }
        return 1 + lengthRecursive(head.next);
    }

    static Node reverseIterative(Node head) {
        Node pre, curr, next;
        pre = null;
        curr = head;
        next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }

    static Node reverseRecursive(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node rest = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return rest;
    }

    public static void main(String[] args) {
        // SinglyLinkedList obj = new SinglyLinkedList();
        Node head = null;
        // head = deleteAtFront(head);
        // iterativeTraversal(head);
        head = insertAtFront(head, 2);
        head = insertAtFront(head, 1);
        head = insertAtEnd(head, 3);
        head = insertAtEnd(head, 5);
        head = insertAtEnd(head, 6);
        head = insertAtEnd(head, 7);
        head = insertAtPosition(head, 3, 4);
        iterativeTraversal(head);
        head = reverseIterative(head);
        iterativeTraversal(head);
        head = reverseIterative(head);
        head = reverseRecursive(head);
        iterativeTraversal(head);
        System.out.println();
        System.out.println("length of list " + lengthIterative(head));
        System.out.println();;
        iterativeTraversal(head);
        head = deleteAtFront(head);
        head = deleteAtEnd(head);
        head = deleteAtEnd(head);
        iterativeTraversal(head);
        head = deleteAtPositionNode(head, 2);
        iterativeTraversal(head);
        System.out.println("Iterative length of list " + lengthIterative(head));
        System.out.println("Recursive length of list " + lengthRecursive(head));

    }
}
