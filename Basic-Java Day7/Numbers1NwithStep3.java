import java.util.Scanner;

public class Numbers1NwithStep3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       double n = Double.parseDouble(scanner.nextLine());

        for (int i = 1; i <= n; i += 2) {
            System.out.println(Math.pow(2, i));
        }
    }
}
