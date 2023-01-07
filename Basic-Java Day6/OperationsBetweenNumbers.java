import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        char operation = scanner.nextLine().charAt(0);

        if (y == 0 && (operation == '/' || operation == '%')) {
            System.out.printf("Cannot divide %d by zero", x);
        } else {
            double result = 0.0;

            switch (operation) {
                case '+':
                    result = x + y;

                    break;
                case '-':
                    result = x - y;
                    break;
                case '*':
                    result = x * y;
                    break;
                case '/':
                    result = (double) x / y;
                    break;
                case '%':
                    result = x % y;
                    break;
            }

            String formattedResult = operation == '/'
                    ? String.format("%.2f", result)
                    : String.format("%.0f", result);



            if (operation == '+' || operation == '-' || operation == '*') {

                System.out.printf("%d %c %d = %.0f - %s", x, operation, y,result, result % 2 == 0 ? "even" : "odd");
            } else if (operation == '/') {
                System.out.printf("%d %c %d = %.2f", x, operation, y ,result);
            } else {
                System.out.printf("%d %c %d = %.0f", x, operation, y ,result);
            }

        }
    }
}
