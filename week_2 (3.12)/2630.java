import java.util.Scanner;

class Main {
    static int[][] square;
    static int white = 0;
    static int blue = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        square = new int[N][N];

        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                square[i][j] = scanner.nextInt();

        div(0, 0, N);
        System.out.println(white);
        System.out.println(blue);

        scanner.close();

    }

    static boolean hasSameColor(int n, int m, int size) {
        int color = square[n][m];
        for (int i = n; i < n + size; i++)
            for (int j = m; j < m + size; j++)
                if (square[i][j] != color) return false;
        return true;
    }

    static void div(int n, int m, int size) {
        if (hasSameColor(n, m, size)) {
            if (square[n][m] == 0) white++;
            else blue++;
            return;
        }
        int div = size / 2;
        div(n, m, div);
        div(n,m + div, div);
        div(n + div, m, div);
        div(n + div, m + div, div);
    }

    /*
    n/2씩 사각형 만들고
    각 사각형에 대해 색상 확인하고 (hasSameColor)
    같으면 사각형 + 1 다르면 다시 재귀
     */

}