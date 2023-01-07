import java.util.Scanner;

public class PotokOtSimvoli {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        for (int i = 0; i < text.length(); i++) {
            char symvol = text.charAt(i);

            System.out.println(symvol);
        }
    }
}
