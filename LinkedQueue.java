public class LinkedQueue {
    private static class Node {
        int data;
        Node next;

        // 초기화
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front, rear;
    private int size;

    // enqueue()
    public void enqueue(int item) {
        Node node = new Node(item);
        if (isEmpty()) {
            front = rear = node;
        } else {
            rear.next = node;
            rear = node;
        }
        size++;
    }

    // dequeue()
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("EMPTY");
            return -1;
        }
        int item = front.data;
        front = front.next;
        if (front == null) rear = null;
        size--;
        return item;
    }

    // peek()
    public int peek() { return front.data; }

    // isEmpty()
    public boolean isEmpty() { return front == null; }

    // size()
    public int size() { return size; }

    // print()
    public void print() {
        Node count = front;
        while (count != null) {
            System.out.println(count.data);
            count = count.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedQueue queue = new LinkedQueue();

        queue.enqueue(12);
        queue.enqueue(45);
        queue.enqueue(56);
        queue.enqueue(64);

        System.out.println("초기 사이즈: " + queue.size());
        queue.print();

        System.out.println("맨 위의 값: " + queue.peek());
        System.out.println("pop 결과: " + queue.dequeue());
        System.out.println("pop 이후 사이즈: " + queue.size());
    }
}