import java.util.Scanner;

public class Number100to200 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());

        if ( numbers < 100) {
            System.out.println("Less than 100");
        } else if (numbers <= 200) {
            System.out.println("Between 100 and 200");

        } else if (numbers > 200) {
            System.out.println("Greater than 200");

        }
    }
}