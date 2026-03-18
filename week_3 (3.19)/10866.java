import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Deque<Integer> deque = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());
        int X;

        for (int i = 0; i < N; i++) {
            String[] data = br.readLine().split(" ");
            switch (data[0]) {
                case "push_front":
                    X = Integer.parseInt(data[1]);
                    deque.addFirst(X);
                    break;
                case "push_back":
                    X = Integer.parseInt(data[1]);
                    deque.addLast(X);
                    break;
                case "pop_front":
                    if (deque.isEmpty()) {
                        sb.append(-1);
                    } else {
                        sb.append(deque.removeFirst());
                    }
                    sb.append('\n');
                    break;
                case "pop_back":
                    if (deque.isEmpty()) {
                        sb.append(-1);
                    } else {
                        sb.append(deque.removeLast());
                    }
                    sb.append('\n');
                    break;
                case "size":
                    sb.append(deque.size());
                    sb.append('\n');
                    break;
                case "empty":
                    sb.append(deque.isEmpty() ? 1 : 0);
                    sb.append('\n');
                    break;
                case "front":
                    if (deque.isEmpty()) {
                        sb.append(-1);
                    } else {
                    sb.append(deque.peekFirst());
                    }
                    sb.append('\n');
                    break;
                case "back":
                    if (deque.isEmpty()) {
                        sb.append(-1);
                    } else {
                        sb.append(deque.peekLast());
                    }
                    sb.append('\n');
                    break;
            }
        }
        System.out.print(sb);
    }
}