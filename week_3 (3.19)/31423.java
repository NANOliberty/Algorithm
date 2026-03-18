import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] unis = new String[N + 1];
        int[] next = new int[N + 1];
        int[] tail = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            unis[i] = br.readLine();
            next[i] = -1;
            tail[i] = i;
        }

        int answer = 0;
        for (int temp = 0; temp < N - 1; temp++) {
            String[] nums = br.readLine().split(" ");
            int i = Integer.parseInt(nums[0]);
            int j = Integer.parseInt(nums[1]);

            next[tail[i]] = j;
            tail[i] = tail[j];
            answer = i;
        }
        StringBuilder sb = new StringBuilder();
        int next_num = answer;
        while (next_num != -1) {
            sb.append(unis[next_num]);
            next_num = next[next_num];
        }
        System.out.print(sb);
    }
}