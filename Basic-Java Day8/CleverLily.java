import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice  = Double.parseDouble(scanner.nextLine());
        double toyPrice = Double.parseDouble(scanner.nextLine());

        double money = 0.0;

        for (int currentAge = 1; currentAge <= age; currentAge++) {
        if (currentAge % 2 == 0) {
            money += 10.0 * (currentAge / 2.0) - 1;
            } else {
            money += toyPrice;
            }
        }
        double diff = Math.abs(money - washingMachinePrice);
        if (money >= washingMachinePrice) {
            System.out.printf("Yes! %.2f",diff);
        }else {
            System.out.printf("No! %.2f", diff);
        }

    }
}
