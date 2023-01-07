import java.util.Scanner;

public class OnTimefortheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMin = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMin = Integer.parseInt(scanner.nextLine());

        int examTimeInMin = examHour * 60 + examMin;
        int arrivalTimeMin = arrivalHour * 60 + arrivalMin;

        int diff = examTimeInMin - arrivalTimeMin;
        String output = " ";

        if (diff >= 0 && diff <= 30) {
            output = "On Time";
        } else if (diff > 30) {
            output = "Early";
        } else {
            output = "Late";
        }
        System.out.println(output);

        String arrivalPeriod = diff < 0 ? "after" : "before";
        diff = Math.abs(diff);
        if (diff < 60) {
            System.out.printf("%d minutes %s the start", diff, arrivalPeriod);
        }else {
            System.out.printf("%d:%02d hours %s the start",diff / 60, diff % 60,arrivalPeriod);
        }
    }
}
