import java.util.Scanner;

public class CinemaTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayOfWeek = scanner.nextLine();

        if ("Monday".equals(dayOfWeek) || "Tuesday".equals(dayOfWeek) || "Friday".equals(dayOfWeek)) {
            System.out.println(12);

        } else if ("Wednesday".equals(dayOfWeek) || "Thursday".equals(dayOfWeek)) {
            System.out.println(14);

        } else if ("Saturday".equals(dayOfWeek) || "Sunday".equals(dayOfWeek)) {
            System.out.println(16);
        }

    }
}
