
public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.insertAtEnd(10);
        list.insertAtBeginning(5);
        list.insertAtPosition(2, 7);

        System.out.println("List: " + list);
        System.out.println("Length (Iterative): " + list.length());
        System.out.println("Length (Recursive): " + list.lengthRecursive());

        System.out.println("Contains 7? " + list.contains(7));
        System.out.println("Contains 100 (recursive)? " + list.containsRecursive(100));

        list.reverse();
        System.out.println("Reversed (Iterative): " + list);

        list.reverseRecursive();
        System.out.println("Reversed again (Recursive): " + list);

        list.deleteAtPosition(2);
        System.out.println("After Deletion at pos 2: " + list);
    }
}
