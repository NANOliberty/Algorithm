import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] num = new int[N];

        for (int i = 0; i < N; i++) {
            num[i] = scanner.nextInt();
        }

        Arrays.sort(num);

        long sum = 0;
        for (int n : num) sum += n;
        System.out.println(Math.round((double) sum / N));

        System.out.println(num[num.length/2]);

        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int n : num) freq.put(n, freq.getOrDefault(n, 0) +1);
        int max = 0;
        for (int n : freq.values()) if (n > max) max = n;

        int mode = 0;
        int count = 0;
        int prev = Integer.MIN_VALUE;
        for (int n : num) {
            if(freq.get(n) == max && n != prev) {
                count++;
                mode = n;
                prev = n;
                if (count == 2) break;
            }
        }
        System.out.println(mode);

        System.out.println(num[N-1] - num[0]);

        scanner.close();

    }
}