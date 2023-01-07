import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double excursionPrice = Double.parseDouble(scanner.nextLine());
        double money = Double.parseDouble(scanner.nextLine());

        int spendCount = 0;
        int days = 0;
        boolean spendALot = false;

        while (money < excursionPrice) {
            ++days;
            String action = scanner.nextLine();
            double  amount = Double.parseDouble(scanner.nextLine());

            switch (action) {
                case "spend":
                    money -= amount;
                    money = Math.max(0, money);
//                    if (money < 0) {
//                        money = 0;
//
//                    }
                    ++spendCount;
                    if (spendCount == 5) {
                        spendALot = true;

                    }
                    break;
                case "save":
                    money += amount;
                    spendCount = 0;
                    break;
            }
            if (spendALot) {
                break;
            }
        }
        if (spendALot) {
            System.out.printf("You can't save the money. %n%d",days);
        } else {
            System.out.printf("You saved the money for %d days.",days);
        }
    }
}
