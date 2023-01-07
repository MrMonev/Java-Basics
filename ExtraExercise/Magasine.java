import java.util.Scanner;

public class Magasine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialQuantityEgs = Integer.parseInt(scanner.nextLine());

        int eggsAvailable = initialQuantityEgs;

        String input = scanner.nextLine();

        int eggsBuy = 0;
        boolean notEnough = false;

        while (!"Close".equals(input)) {
            String command = input;
            int eggsBuyOrFill = Integer.parseInt(scanner.nextLine());

            switch (command) {
                case "Buy":
                    eggsAvailable -= eggsBuyOrFill;
                    if (eggsAvailable < 0) {
                        notEnough = true;
                        eggsBuyOrFill -= Math.abs(eggsAvailable);
                    }

                    eggsBuy +=eggsBuyOrFill;
                    break;

                case "Fill":
                    eggsAvailable += eggsBuyOrFill;
                    break;
            }
            if (notEnough) {
                System.out.printf("Not enough eggs in store!%nYou can buy only %d.", eggsBuyOrFill);
                break;
            }
            input = scanner.nextLine();
        }
        if ("Close".equals(input)) {
            System.out.printf("Store is closed!%n%d eggs sold.", eggsBuy);
        }

        }

    }


