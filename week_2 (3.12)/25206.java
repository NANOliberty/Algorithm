// 전공평점은 전공과목별 (학점 × 과목평점)의 합을 학점의 총합으로 나눈 값
import java.util.HashMap;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum_credit = 0;
        double mult = 0.0;

        HashMap<String, Double> gradeMap = new HashMap<>();
        gradeMap.put("A+", 4.5);
        gradeMap.put("A0", 4.0);
        gradeMap.put("B+", 3.5);
        gradeMap.put("B0", 3.0);
        gradeMap.put("C+", 2.5);
        gradeMap.put("C0", 2.0);
        gradeMap.put("D+", 1.5);
        gradeMap.put("D0", 1.0);
        gradeMap.put("F",  0.0);

        while (sc.hasNext()) {

            String name   = sc.next();
            double credit = sc.nextDouble();
            String grade  = sc.next();

            if (!grade.equals("P")) {
                sum_credit += credit;
                mult += credit * gradeMap.get(grade);
            }
        }

        System.out.printf("%f", mult / (double) sum_credit);

    }
}