import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int user1 = Integer.parseInt(scanner.nextLine());
        int user2 = Integer.parseInt(scanner.nextLine());

        if (user1 > user2) {
            System.out.println(user1);
        } else {
            System.out.println(user2);
        }
    }
}
