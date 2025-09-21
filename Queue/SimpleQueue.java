public class SimpleQueue {

    private static int maxSize = 10;
    private static int rear = -1;
    private static int head = -1;
    private static int data;
    private static int queue[] = new int[maxSize];

    public static void main(String[] args) {
        SimpleQueue obj = new SimpleQueue();
        obj.enqueue(1);
        obj.enqueue(2);
        obj.enqueue(3);
        obj.enqueue(4);
        obj.enqueue(6);
        obj.enqueue(7);
        obj.enqueue(8);
        obj.enqueue(9);
        obj.enqueue(10);
        obj.enqueue(11);
        obj.enqueue(12);
        obj.traverseQueue();
        
        obj.dequeue();
        obj.traverseQueue();
        obj.enqueue(12);
    }

    public void traverseQueue() {
        if (head == -1 || head > rear) {
            System.out.println("Queue is empty!!");
            return;
        }

        for (int i = head; i <= rear; i++) {
            System.out.print(queue[i]+" ");
        }
        System.out.println();

    }

    public void enqueue(int data) {
        if (rear == maxSize - 1) {
            System.out.println("Overflow!!");
            return;
        }
        if (head == -1) {
            head = 0;
        }

        rear++;
        queue[rear] = data;
        System.out.println("inserted " + data);
    }

    public void dequeue() {
        if (head == -1 || head > rear) {
            System.out.println("Empty!!");
            return;
        }

        System.out.println("deleted " + queue[head]);
        head++;

        if (head > rear) {
            head = -1;
            rear = -1;
        }

    }

}
