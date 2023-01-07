import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int w = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());

        int freeSpace = w * l * h;
        int neededSpace = 0;

        String input = scanner.nextLine();
        while (!"Done".equals(input)) {
            int numOfCartons = Integer.parseInt(input);
            neededSpace += numOfCartons;
            if (neededSpace > freeSpace) {
                break;
            }

            input = scanner.nextLine();

        }

        int result = freeSpace - neededSpace;

        if (result < 0) {
            System.out.printf("No more free space! You need %d Cubic meters more.",Math.abs(result));
        } else {
            System.out.printf("%d Cubic meters left.", result);
        }
    }
}
