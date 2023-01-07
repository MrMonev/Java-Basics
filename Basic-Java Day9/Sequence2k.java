import java.util.Scanner;

public class Sequence2k {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int k = 1;

        while (true) {
            if (k > n) {
                break;
            }
            System.out.println(k);
            k = 2 * k + 1;

        }
    }
}
