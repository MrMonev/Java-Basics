import java.util.Scanner;

public class NumbersEndingIn7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i < n; i *= 4) {
                System.out.println(i);
            }
        }
    }


