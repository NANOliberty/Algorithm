import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.equals(".")) break;

            boolean result = check(line);
            System.out.println(result ? "yes" : "no");
        }
        scanner.close();
    }

    public static boolean check(String line) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);

            if (c == '(' || c == '[') stack.push(c == '(' ? (int) '(' : (int) '[');
            if (c == ')' || c == ']') {
                if (stack.isEmpty()) return false;

                int top = stack.pop();

                if (c == ')' && top != '(') return false;
                if (c == ']' && top != '[') return false;
            }
        }
        return stack.isEmpty();
    }
}