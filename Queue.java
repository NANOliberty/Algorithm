public class Queue {
    private int[] data;
    private int front, rear, size, capacity;

    // 초기화
    public Queue(int capacity) {
        this.capacity = capacity;
        this.data = new int[capacity];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }

    // enqueue()
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("FULL");
            return;
        }
        data[rear] = item;
        rear = (rear + 1) % capacity;
        size++;
    }

    // dequeue()
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("EMPTY");
            return -1;
        }
        int item = data[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    // peek()
    public int peek() { return data[front]; }

    // isEmpty()
    public boolean isEmpty() { return size == 0; }

    // isFull()
    public boolean isFull() { return size == capacity; }

    // size()
    public int size() { return size; }

    // print()
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(data[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue queue = new Queue(8);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        System.out.println("초기 사이즈: " + queue.size());
        queue.print();

        System.out.println("맨 위의 값: " + queue.peek());
        System.out.println("pop 결과: " + queue.dequeue());
        System.out.println("pop 이후 사이즈: " + queue.size());
    }
}