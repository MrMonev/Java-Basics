import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int widthCake = Integer.parseInt(scanner.nextLine());
        int lengthCake = Integer.parseInt(scanner.nextLine());

        int totalPeaces = widthCake * lengthCake;


        String input = scanner.nextLine();
        while (!"STOP".equals(input)) {
        int leftPeaces = Integer.parseInt(input);
        totalPeaces -= leftPeaces;
        if (totalPeaces <= 0) {
            break;
        }

         input = scanner.nextLine();
        }

        if (totalPeaces > 0) {
            System.out.printf("%d pieces are left.",totalPeaces);
        } else {
            System.out.printf("No more cake left! You need %d pieces more.",Math.abs(totalPeaces));
        }

    }
}
