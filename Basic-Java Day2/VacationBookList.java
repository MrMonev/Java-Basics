import java.util.Scanner;

public class VacationBookList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPages = Integer.parseInt(scanner.nextLine());
        int pages = Integer.parseInt(scanner.nextLine());
        int numberOfDays = Integer.parseInt(scanner.nextLine());

        int totalTime = numberOfPages / pages;
        int needTime = totalTime / numberOfDays;
        System.out.println(needTime);
    }
}