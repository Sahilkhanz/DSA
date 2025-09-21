
public class DoublyLinkedList {

    static class Node {

        int data;
        Node pre, next;

        public Node(int data) {
            this.data = data;
            this.pre = null;
            this.next = null;
        }
    }

    // Node head = null;
    // Node tail = null;
    static Node insertAtFront(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        if (head != null) {
            head.pre = newNode;
        }
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
        newNode.pre = temp;
        return head;
    }

    static Node insertAtPosition(Node head, int pos, int data) {
        if (pos <= 0) {
            System.out.println("Invalid input");
            return head;
        }
        if (pos == 1) {
            return insertAtFront(head, data);
        }

        Node newNode = new Node(data);

        Node temp = head;

        for (int i = 1; temp != null && i < pos - 1; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of bound");
            return head;
        }

        newNode.next = temp.next;
        newNode.pre = temp;

        if (temp.next != null) {
            temp.next.pre = newNode;
        }
        temp.next = newNode;
        return head;
    }

    static Node deleteAtFront(Node head) {
        Node temp = head;
        if (temp == null) {
            System.out.println("Cannot delete");
            return null;
        }

        temp = temp.next;
        if (temp != null) {
            temp.pre = null;
        }
        return temp;
    }

    static Node deleteAtEnd(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.pre.next = null;
        return head;

    }

    static Node deleteAtPosition(Node head, int pos) {
        if (pos < 0) {
            System.out.println("invalid position");
            return head;
        }
        if (pos == 1) {
            return deleteAtFront(head);
        }
        Node temp = head;
        for (int i = 0; temp != null && i < pos - 1; i++) {
            temp = temp.next;
        }

        temp.pre.next = temp.next;
        temp.next.pre = temp.pre;
        return head;

    }

    static void traversalForward(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    static void traversalBackward(Node head) {
        Node temp = head;
        if (temp == null) {
            return;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        while (temp != null) {
            System.err.print(temp.data + " -> ");
            temp = temp.pre;

        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = null;

        head = insertAtFront(head, 1);
        head = insertAtFront(head, 2);
        head = insertAtFront(head, 3);
        head = insertAtFront(head, 4);
        head = insertAtFront(head, 5);
        traversalForward(head);
        traversalBackward(head);
        head = insertAtEnd(head, 100);
        head = insertAtEnd(head, 1);
        head = insertAtEnd(head, 2);
        head = insertAtEnd(head, 3);
        head = insertAtEnd(head, 4);
        head = insertAtEnd(head, 5);
        traversalForward(head);
        head = deleteAtFront(head);
        head = deleteAtFront(head);
        head = deleteAtFront(head);
        head = deleteAtFront(head);
        head = deleteAtFront(head);
        traversalForward(head);
        head = deleteAtEnd(head);
        head = deleteAtEnd(head);
        head = deleteAtEnd(head);
        traversalForward(head);

        head = insertAtPosition(head, 2, 200);
        traversalForward(head);
    }
}

//                            head
//                             |
//             newnode = 6-->  1 -> 2 -> 3 -> 4 -> null
