import java.util.Scanner;

public class DepositCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double depositSum = Double.parseDouble(scanner.nextLine());
        int period = Integer.parseInt(scanner.nextLine());
        double interestRate = Double.parseDouble(scanner.nextLine());

        double ratePerMount = (depositSum / 100 * interestRate) / 12;
        double result = depositSum + period * ratePerMount;
        System.out.println(result);

    }
}