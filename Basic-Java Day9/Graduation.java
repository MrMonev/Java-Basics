import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String studentName = scanner.nextLine();

        int grade = 1;
        double totalGrade = 0.0;
        int count = 0;

        while (true) {
            double avgGrade = Double.parseDouble(scanner.nextLine());

            if (avgGrade >= 4.0) {
                totalGrade += avgGrade;
                if (grade >= 12) {
                    double averageGradeForStudent = totalGrade / 12;
                    System.out.printf("%s graduated. Average grade: %.2f", studentName, averageGradeForStudent);
                    break;
                }
                grade++;
            } else {
                    count++;
                    if (count >= 2) {
                        System.out.printf("%s has been excluded at %d grade", studentName, grade);
                        break;
                    }
                }
            }
        }
    }

