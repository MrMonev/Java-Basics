import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int mintNumber = Integer.MAX_VALUE;


        while (!input.equals("Stop")) {
            int sum = Integer.parseInt(input);

            if (sum < mintNumber) {
                mintNumber = sum;

        }
            input = scanner.nextLine();
        }
        System.out.println(mintNumber);
    }
}
