import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String book = scanner.nextLine();

        boolean isFoundBook = false;
        int countBooks = 0;

        String input = scanner.nextLine();
        while (!"No More Books".equals(input)) {
            if (book.equals(input)) {
                isFoundBook = true;
                break;
            }

            countBooks++;
            input = scanner.nextLine();
        }
        if (isFoundBook) {
            System.out.printf("You checked %d books and found it.", countBooks);
        } else {
            System.out.printf("The book you search is not here! %nYou checked %d books.",countBooks);
        }
    }
}
