public class Stack {
    private int[] data;
    private int top;
    private int capacity;

    // 초기화
    Stack(int capacity) {
        this.capacity = capacity;
        this.data = new int[capacity];
        this.top = -1;
    }

    // push
    public void push(int item) {
        if (isFull()) {
            System.out.println("FULL");
            return;
        }
        data[++top] = item;
    }

    // pop, 값 리턴
    public int pop() {
        if (isEmpty()) {
            System.out.println("EMPTY");
            return -1;
        }
        return data[top--];

    }

    // peek, 맨 위의 값 확인
    public int peek() {
        if (isEmpty()) {
            System.out.println("EMPTY");
            return -1;
        }
        return data[top];
    }

    // 비어있는지 확인
    public boolean isEmpty() { return top == -1; }

    // 꽉 찼는지 확인
    public boolean isFull() { return top == capacity -1; }

    // 스택의 크기
    public int size() {return top + 1;}

    // 전체 출력
    public void print() {
        for(int i = 0; i <= top; i++) {
            System.out.println(data[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(5);
        stack.push(6);
        stack.push(9);
        stack.push(2);
        System.out.println("초기 사이즈: " + stack.size());
        stack.print();

        System.out.println("맨 위의 값: " + stack.peek());
        System.out.println("pop 결과: " + stack.pop());
        System.out.println("pop 이후 사이즈: " + stack.size());
    }
}