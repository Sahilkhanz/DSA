
public class CircularQueue {

    private int rear, front, maxSize, queue[];

    CircularQueue(int size) {
        front = -1;
        rear = -1;
        maxSize = size;
        queue = new int[maxSize];
    }

    public boolean isEmpty() {
        return rear == -1 && front == -1;
    }

    private void enQueue(int data) {
        if (isEmpty()) {
            front = 0;
            rear = 0;
            queue[rear] = data;
        } else {
            int newRear = (rear + 1) % maxSize;
            if (newRear == front) {
                System.out.println("Overflow!! Can't insert " + data);

            } else {
                rear = newRear;
                queue[rear] = data;
            }

        }

    }

    private void deQueue() {
        if (isEmpty()) {
            System.out.print("Empty!!");
        } else {
            if (rear == front) {
                front = -1;
                rear = -1;
            } else {
                int item = queue[front];
                front = (front + 1) % maxSize;
                System.out.println("Item " + item + " deleted");
            }
        }
    }

    private void queueTraversal() {
        if (isEmpty()) {
            System.out.println("Empty!!");
        } else {
            int i = front;
            do {
                System.out.print(queue[i] + " ");
                i = (i + 1) % maxSize;
            } while (i != (rear + 1) % maxSize);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CircularQueue obj = new CircularQueue(10);
        obj.queueTraversal();
        obj.enQueue(1);
        obj.enQueue(2);
        obj.enQueue(3);
        obj.enQueue(4);
        obj.enQueue(5);
        obj.enQueue(6);
        obj.enQueue(7);
        obj.enQueue(8);
        obj.enQueue(9);
        obj.enQueue(10);
        obj.queueTraversal();
        obj.deQueue();
        obj.deQueue();
        obj.deQueue();
        obj.deQueue();
        obj.deQueue();
        obj.deQueue();
        obj.enQueue(11);
        System.out.println("print");
        obj.queueTraversal();
    }

}
