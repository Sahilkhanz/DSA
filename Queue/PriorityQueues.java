
class Item {

    int val, priority;

    Item(int val, int priority) {
        this.val = val;
        this.priority = priority;
    }
}

public class PriorityQueues {

    Item[] pq;
    int size;

    PriorityQueues(int capacity) {
        pq = new Item[capacity];
        size = 0;
    }

    // Function to insert element in priority queue
    void enqueue(int val, int priority) {
        pq[size++] = new Item(val, priority);
    }

    // Function to get index of element with highest priority
    int peek() {
        int ind = -1, maxPriority = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {

            // Update index if a higher priority is found
            if (pq[i].priority > maxPriority
                    || (pq[i].priority == maxPriority && pq[i].val > pq[ind].val)) {
                maxPriority = pq[i].priority;
                ind = i;
            }
        }
        return ind;
    }

    // Function to remove the element with highest priority
    void dequeue() {
        // Get index of highest priority element
        int ind = peek();
        if (ind != -1) {
            pq[ind] = pq[size - 1];
            size--;
        }
    }

    public static void main(String[] args) {
        PriorityQueues pq = new PriorityQueues(10);
        pq.enqueue(10, 2);
        pq.enqueue(14, 4);
        pq.enqueue(16, 4);
        pq.enqueue(12, 3);

        System.out.println(pq.pq[pq.peek()].val);
        pq.dequeue();

        System.out.println(pq.pq[pq.peek()].val);
        pq.dequeue();

        System.out.println(pq.pq[pq.peek()].val);
    }
}
