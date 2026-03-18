import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            if (a == 0) System.out.println(give(pq));
            else
                for(int j = 0; j < a; j++) {
                    pq.offer(scanner.nextInt());
                }
        }
        scanner.close();
    }

    public static int give(PriorityQueue<Integer> pq) {
        if (pq.isEmpty()) return -1;
        else return pq.poll();
    }
}