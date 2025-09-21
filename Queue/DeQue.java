
public class DeQue {

    private int maxSize, rear, front, size, queue[];

    public DeQue(int size) {
        maxSize = size;
        front = 0;
        this.size = 0;
        queue = new int[maxSize];

    }

    private void enQueueFront(int data) {
        if (size == maxSize) {
            System.out.println("overflow! Can't insert " + data);
        } else {
            front = (front - 1 + maxSize) % maxSize;
            queue[front] = data;
            size++;
        }

    }

    private void enQueueRear(int data) {
        if (size == maxSize) {
            System.out.println("OverFlow!! can't insert " + data);
        } else {
            rear = (front + size) % maxSize;
            queue[rear] = data;
            size++;
        }
    }

    private void queueTrversal() {
        if (size == 0) {
            System.out.println("Emty!!");
        } else {
            int i = front, j = 0;
            do {
                System.out.print(queue[i] + " ");
                i = (i + 1) % maxSize;
                ++j;
            } while (j < size);
            System.out.println();
        }
    }

    private void deQueueFront() {
        if (size == 0) {
            System.out.println("Empty!!");
        } else {
            int element = queue[front];
            front = (front + 1) % maxSize;
            System.out.println("element deleted " + element);
            size--;
        }
    }

    private void deQueueRear() {
        if (size == 0) {
            System.out.println("Empty");
        } else {
            int element = queue[rear];
            rear = (rear + size) % maxSize;
            size--;
        }
    }

    public static void main(String[] args) {
        DeQue opera = new DeQue(5);
        opera.enQueueFront(2);
        opera.enQueueFront(3);
        opera.enQueueFront(4);
        opera.queueTrversal();
        opera.deQueueFront();
        opera.deQueueFront();
        opera.deQueueFront();
        opera.queueTrversal();
        opera.enQueueRear(1);
        opera.enQueueRear(2);
        opera.enQueueRear(3);
        opera.enQueueRear(4);
        opera.enQueueRear(5);
        opera.deQueueRear();
        opera.deQueueRear();
        opera.deQueueRear();
        opera.deQueueRear();
        opera.deQueueRear();
        opera.enQueueFront(0);
        opera.deQueueRear();        
        opera.enQueueFront(2);
        opera.enQueueFront(3);
        opera.enQueueFront(4);
        opera.queueTrversal();
    }
}
