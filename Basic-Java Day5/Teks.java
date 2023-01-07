import java.util.Scanner;

public class Teks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int length = text.length();
        System.out.println(length);

        char letter = text.charAt(text.length() - 1);
        System.out.println(letter);
    }
}
