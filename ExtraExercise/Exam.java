import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPeopleOnExam = Integer.parseInt(scanner.nextLine());

        double groupOne = 0.0;
        double groupTwo = 0.0;
        double groupThree = 0.0;
        double groupFour = 0.0;

        double grade = 0.0;

        for (int i = 0; i < totalPeopleOnExam; i++) {
            double gradeForStudent = Double.parseDouble(scanner.nextLine());

            grade = gradeForStudent + grade;


            if (gradeForStudent >= 2.00 && gradeForStudent <= 2.99) {
                groupFour++;

            } else if (gradeForStudent >= 3.00 && gradeForStudent <= 3.99) {
                groupThree++;

            } else if (gradeForStudent >= 4.00 && gradeForStudent <= 4.99) {
                groupTwo++;

            } else if (gradeForStudent >= 5.00 && gradeForStudent <= 6.00)
                groupOne++;

        }
        groupOne = groupOne / totalPeopleOnExam * 100;
        groupTwo = groupTwo / totalPeopleOnExam * 100;
        groupThree = groupThree / totalPeopleOnExam * 100;
        groupFour = groupFour / totalPeopleOnExam * 100;

        double averageSuccess = 0.0;

        averageSuccess = grade / totalPeopleOnExam;


        System.out.printf("Top students: %.2f%%%n", groupOne);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", (groupTwo));
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", (groupThree));
        System.out.printf("Fail: %.2f%%%n", (groupFour));
        System.out.printf("Average: %.2f", (averageSuccess));

    }
}

