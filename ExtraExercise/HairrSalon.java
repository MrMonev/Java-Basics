import java.util.Scanner;

public class HairrSalon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int goal = Integer.parseInt(scanner.nextLine());

        String type = scanner.nextLine();


        int mens = 15;
        int ladies = 20;
        int kids = 10;
        int touchUp = 20;
        int fullColor = 30;

        int totalPrice = 0;


        while (!"closed".equals(type)) {

            String command = scanner.nextLine();


            switch (type) {
                case "haircut":

                    switch (command) {
                        case "mens":
                            totalPrice += mens;

                            break;
                        case "ladies":
                            totalPrice += ladies;
                            break;
                        case "kids":
                            totalPrice += kids;

                            break;
                    }
                    break;

                case "color":
                    switch (command) {
                        case "touch up":
                            totalPrice += touchUp;

                            break;
                        case "full color":
                            totalPrice += fullColor;
                            break;
                    }
                    break;
            }
            if (goal <= totalPrice) {
                break;
            }

            type = scanner.nextLine();
        }
        if (goal <= totalPrice) {
            System.out.println("You have reached your target for the day!");

        } else  {
            System.out.printf("Target not reached! You need %dlv. more.", goal - totalPrice);
        }
        System.out.printf("Earned money: %d lv.", totalPrice);

    }
}
