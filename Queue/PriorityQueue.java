
public class PriorityQueue {

    int size;
    Item[] prioQueue;

    public PriorityQueue(int size) {
        prioQueue = new Item[size];
        this.size = 0;
    }

    public void enQueue(int data, int priority) {
        prioQueue[size] = new Item(data, priority);
        size++;
    }

    public int peek() {
        int index = -1;
        int maxPriority = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {
            if (prioQueue[i].priority > maxPriority
                    || (prioQueue[i].priority == maxPriority && prioQueue[i].data > prioQueue[index].data)) {
                maxPriority = prioQueue[i].priority;
                index = i;

            }
        }
        return index;
    }

    void deQueue() {
        int ind = peek();

        if (ind != -1) {
            prioQueue[ind] = prioQueue[size - 1];
            size--;
        }
    }

    public static void main(String[] args) {
        PriorityQueue obj = new PriorityQueue(5);
        obj.enQueue(10, 6);
        obj.enQueue(18, 4);
        obj.enQueue(16, 4);
        obj.enQueue(12, 3);
        System.out.println(obj.prioQueue[obj.peek()].data);
        obj.deQueue();
        System.out.println(obj.prioQueue[obj.peek()].data);
        obj.deQueue();
        System.out.println(obj.prioQueue[obj.peek()].data);
        obj.deQueue();
        System.out.println(obj.prioQueue[obj.peek()].data);
        obj.deQueue();
    }

}

class Item {

    int data, priority;

    public Item(int data, int priority) {
        this.data = data;
        this.priority = priority;
    }
}
