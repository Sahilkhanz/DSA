// public // LinkedList.java

public class LinkedList<T> {
// LinkedList
    // Node class (generic & private)

    private static class Node<T> {

        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    private Node<T> head;

    // Insert at beginning
    public void insertAtBeginning(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at end
    public void insertAtEnd(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node<T> current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Insert at specific position (1-based index)
    public void insertAtPosition(int position, T data) {
        if (position < 1) {
            throw new IllegalArgumentException("Position must be >= 1");
        }
        if (position == 1) {
            insertAtBeginning(data);
            return;
        }

        Node<T> newNode = new Node<>(data);
        Node<T> current = head;
        for (int i = 1; current != null && i < position - 1; i++) {
            current = current.next;
        }

        if (current == null) {
            throw new IllegalArgumentException("Position out of bounds");
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    // Delete at position
    public void deleteAtPosition(int position) {
        if (position < 1 || head == null) {
            throw new IllegalArgumentException("Invalid position or empty list");
        }
        if (position == 1) {
            head = head.next;
            return;
        }

        Node<T> current = head;
        for (int i = 1; current != null && i < position - 1; i++) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            throw new IllegalArgumentException("Position out of bounds");
        }

        current.next = current.next.next;
    }

    // Iterative search
    public boolean contains(T key) {
        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(key)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Recursive search
    public boolean containsRecursive(T key) {
        return containsRecursive(head, key);
    }

    private boolean containsRecursive(Node<T> node, T key) {
        if (node == null) {
            return false;
        }
        if (node.data.equals(key)) {
            return true;
        }
        return containsRecursive(node.next, key);
    }

    // Convert to string (Iterative display)
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<T> current = head;
        while (current != null) {
            sb.append(current.data).append(" → ");
            current = current.next;
        }
        sb.append("null");
        return sb.toString();
    }

    // Length (iterative)
    public int length() {
        int count = 0;
        Node<T> current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // Length (recursive)
    public int lengthRecursive() {
        return lengthRecursive(head);
    }

    private int lengthRecursive(Node<T> node) {
        if (node == null) {
            return 0;
        }
        return 1 + lengthRecursive(node.next);
    }

    // Reverse (iterative)
    public void reverse() {
        Node<T> prev = null, current = head, next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    // Reverse (recursive)
    public void reverseRecursive() {
        head = reverseRecursive(head);
    }

    private Node<T> reverseRecursive(Node<T> node) {
        if (node == null || node.next == null) {
            return node;
        }
        Node<T> rest = reverseRecursive(node.next);
        node.next.next = node;
        node.next = null;
        return rest;
    }
}
