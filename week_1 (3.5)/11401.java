import java.util.Scanner;

class Main {
    static final long MOD = 1_000_000_007L;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        scanner.close();

        System.out.println(solution(N, K));
    }

    static long solution(int N, int K) {
        if (K < 0 || K > N) return 0;

        long[] fact = new long[N + 1];
        fact[0] = 1;
        for (int i = 1; i <= N; i++) {
            fact[i] = fact[i - 1] * i % MOD;
        }

        return fact[N] * modPow(fact[K], MOD - 2) % MOD
                       * modPow(fact[N - K], MOD - 2) % MOD;
    }

    static long modPow(long a, long b) {
        long result = 1;
        a %= MOD;
        while (b > 0) {
            if ((b & 1) == 1) result = (result * a) % MOD;
            a = (a * a) % MOD;
            b >>= 1; // b /= 2
        }
        return result;
    }
}