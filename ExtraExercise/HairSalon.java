import java.util.Scanner;

public class HairSalon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int goal = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();


        int priceMens = 15;
        int priceLadies = 20;
        int priceKids = 10;
        int priceTouchUp = 20;
        int priceFullColor = 30;

        int totalPrice = 0;

        while (!"closed".equals(input)) {
            String command = scanner.nextLine();

            switch (input) {
                case "haircut":
                    if (command.equals("mens")) {
                        totalPrice += priceMens;
                    } else if (command.equals("ladies")) {
                        totalPrice += priceLadies;
                    } else if (command.equals("kids")) {
                        totalPrice += priceKids;

                    }
                    break;
                case "color":
                    if (command.equals("touch up")) {
                        totalPrice += priceTouchUp;
                    } else if (command.equals("full color")) {
                        totalPrice += priceFullColor;
                    }
                    break;


            }
            if (goal <= totalPrice){
                break;
            }
            input = scanner.nextLine();
        }
        if (goal <= totalPrice) {
            System.out.println("You have reached your target for the day!");

        } else {
            System.out.printf("Target not reached! You need %dlv. more.", goal - totalPrice);
        }
        System.out.printf("Earned money: %d lv.", totalPrice);

    }
}








