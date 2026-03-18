public class LinkedStack {

    // Node: data + next(포인터)
    private static class Node {
        int data;
        Node next;
        // 노드 기본값
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;
    private int size;

    // 초기화
    public LinkedStack() {
        this.top = null;
        this.size = 0;
    }

    // push
    public void push(int item) {
        Node node = new Node(item);
        node.next = top;
        top = node;
        size++;
    }

    // pop
    public int pop() {
        if (isEmpty()) {
            System.out.println("Empty");
            return -1;
        }
        int item = top.data;
        top = top.next;
        size--;
        return item;
        // 99 -> 50 -> 32 -> 25 -> null
    }

    // peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("Empty");
            return -1;
        }
        return top.data;
    }

    // isEmpty
    public boolean isEmpty() {return top == null; }

    // size
    public int size() { return size; }

    // print
    public void print() {
        Node count = top;
        while (count != null) {
            System.out.println(count.data);
            count = count.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedStack stack = new LinkedStack();

        stack.push(25);
        stack.push(32);
        stack.push(50);
        stack.push(99);
        System.out.println("초기 사이즈: " + stack.size());
        stack.print();

        System.out.println("맨 위의 값: " + stack.peek());
        System.out.println("pop 결과: " + stack.pop());
        System.out.println("pop 이후 사이즈: " + stack.size());
    }
}