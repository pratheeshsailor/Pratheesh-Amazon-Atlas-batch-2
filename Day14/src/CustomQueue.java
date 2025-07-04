public class CustomQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public CustomQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + data);
            return;
        }
        rear = rear + 1;
        if (rear == capacity) {
            rear = 0;
        }
        queue[rear] = data;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int removed = queue[front];
        front = front + 1;
        if (front == capacity) {
            front = 0;
        }
        size--;
        return removed;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Nothing to peek.");
            return -1;
        }
        return queue[front];
    }
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("Queue elements: ");
        for (int i = 0; i < size; i++) {
            int index = front + i;
            if (index >= capacity) {
                index -= capacity;
            }
            System.out.print(queue[index] + " ");
        }
        System.out.println();
    }


    // Main method to test the custom queue
    public static void main(String[] args) {
        CustomQueue q = new CustomQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();

        System.out.println("Peek: " + q.peek());
        System.out.println("Dequeued: " + q.dequeue());

        q.display();
        System.out.println("Is full? " + q.isFull());

        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        q.display();

        q.enqueue(70);// Should show full message
    }
}
