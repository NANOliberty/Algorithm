import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int W = scanner.nextInt();
        int S = scanner.nextInt();


        // 직선
        long way_1 = (long) (X + Y) * W;

        // 대각선 우선 + 직선
        long way_2 = (long) Math.min(X, Y) * S + (long) Math.abs(X - Y) * W;

        // 대각선 2개 +1, + 1 / +1, -1
        // 각각 a, b번 이면 a+b = X, a-b = Y
        long way_3;
        if ((X + Y) % 2 == 0) way_3 = (long) Math.max(X, Y) * S; // 짝수
        else way_3 = W + (long) (Math.max(X, Y) - 1) * S;

        System.out.println(Math.min(Math.min(way_1, way_2), way_3));

        scanner.close();

    }
}

/*

가로: Y + 1
세로: X + 1
대각선: 둘 다 + 1
기본적으로는 대각선


1. 우선 대각선 가로 세로 다 +1
2. 직선
3. 대각성 여러 방향 (홀짝, X와 Y중 큰 값 줄이기)

! - -
- - -
- - -
- - -
- - !


! - -
- - -
- - -
- - -
- - -
- - !


! - - - - -
- - - - - -
- - - - - !
2 5 10 5
대각선 4, 직선 1
 */