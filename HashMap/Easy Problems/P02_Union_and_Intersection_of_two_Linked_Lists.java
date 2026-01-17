
import java.util.HashSet;

public class P02_Union_and_Intersection_of_two_Linked_Lists {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node head1 = new Node(10);
        head1.next = new Node(15);
        head1.next.next = new Node(4);
        head1.next.next.next = new Node(20);

        Node head2 = new Node(8);
        head2.next = new Node(4);
        head2.next.next = new Node(2);
        head2.next.next.next = new Node(10);

        Node curr = head1;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println();
        Node curr2 = head2;
        while (curr2 != null) {
            System.out.print(curr2.data + " -> ");
            curr2 = curr2.next;
        }

        intersection(head1, head2);
        union(head1, head2);
    }

    public static void intersection(Node head1, Node head2) {
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> added = new HashSet<>();
        Node curr = head2;

        while (curr != null) {
            hs.add(curr.data);
            curr = curr.next;
        }

        Node intersectionHead = new Node(0);
        Node intersection = intersectionHead;

        Node curr1 = head1;
        while (curr1 != null) {
            if (hs.contains(curr1.data) && !added.contains(curr1.data)) {
                intersection.next = new Node(curr1.data);
                intersection = intersection.next;
                added.add(curr1.data);
            }
            curr1 = curr1.next;
        }

        System.out.println();
        Node dummy = intersectionHead.next;
        while (dummy != null) {
            System.out.print(dummy.data + " -> ");
            dummy = dummy.next;
        }
        System.out.println();
    }

    static void union(Node head1, Node head2) {
        Node unionHead = new Node(1);
        Node union = unionHead;
        HashSet<Integer> hs = new HashSet<>();
        Node curr = head1;

        while (curr != null) {
            hs.add(curr.data);
            union.next = new Node(curr.data);
            union = union.next;
            curr = curr.next;
        }

        Node curr2 = head2;
        while (curr2 != null) {
            if (!hs.contains(curr2.data)) {
                union.next = new Node(curr2.data);
                union = union.next;
            }
            curr2 = curr2.next;
        }

        Node dummy = unionHead.next;
        while (dummy != null) {
            System.out.print(dummy.data + " -> ");
            dummy = dummy.next;
        }

        System.out.println();
    }
}
