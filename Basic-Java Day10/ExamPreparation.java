import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxPoorGrades = Integer.parseInt(scanner.nextLine());

        String problemName = "";
        int poorGradesCount = 0;
        int gradesSum = 0;
        int problemCount = 0;

        String input = scanner.nextLine();

        while (!"Enough".equals(input)) {
            problemCount++;
            problemName = input;
            int grade = Integer.parseInt(scanner.nextLine());
            if (grade <= 4) {
                poorGradesCount++;
                if (poorGradesCount == maxPoorGrades) {
                    break;
                }
            }

            gradesSum += grade;
            input = scanner.nextLine();
        }

        if (poorGradesCount == maxPoorGrades) {
            System.out.printf("You need a break, %d poor grades.", poorGradesCount);
        } else {
            System.out.printf("Average score: %.2f%n", (double) gradesSum / problemCount);
            System.out.printf("Number of problems: %d%n",problemCount);
            System.out.printf("Last problem: %s", problemName);
        }
    }
}
