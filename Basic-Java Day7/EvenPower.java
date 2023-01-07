import java.util.Scanner;

public class EvenPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i *= n) {
            System.out.println(i);
        }
    }
}
