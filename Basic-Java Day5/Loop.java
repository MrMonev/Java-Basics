import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int sum = 0;

        for (int i = 0; i < text.length(); i++) {
            char latter = text.charAt(i);


            switch (latter) {
                case 'a':
                    sum = sum + 1;
                case 'e':
                    sum = sum + 2;
                case 'i':
                    sum = sum + 3;
                case 'o':
                    sum = sum + 4;
                case 'u':
                    sum = sum + 5;
                    break;
            }
        }
        System.out.println(sum);
    }
}
