import java.util.InvalidPropertiesFormatException;
import java.util.Scanner;

public class Eggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstPlayer = Integer.parseInt(scanner.nextLine());
        int secondPlayer = Integer.parseInt(scanner.nextLine());

        while (true) {
            String command = scanner.nextLine();
            if (command.equals("End")) {
                System.out.printf("Player one has %d eggs left.%n",firstPlayer);
                System.out.printf("Player two has %d eggs left.",secondPlayer);
                break;
            }
            if (command.equals("one")) {
               secondPlayer--;
            }else  if (command.equals("two")) {
                firstPlayer--;
            }
            if (firstPlayer <= 0) {
                System.out.printf("Player one is out of eggs. Player two has %d eggs left.",secondPlayer);
                break;
            }
            if (secondPlayer <= 0) {
                System.out.printf("Player two is out of eggs. Player one has %d eggs left.",firstPlayer);
                break;

            }
        }
    }
}
