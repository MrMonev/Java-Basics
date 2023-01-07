import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        for (int i = a; i <= b; i++) {

            int currentNum = i;
            int evenPosSum = 0;
            int oddPosSum = 0;

            for (int j = 6; j > 0 ; j--) {
                int lastDigit = currentNum % 10;
                currentNum /= 10;

                if (j % 2 == 0) {
                    evenPosSum += lastDigit;

                } else {
                    oddPosSum += lastDigit;

                }
                
            }
            if (evenPosSum == oddPosSum) {
                System.out.print(i + " ");
            }

        }
    }
}
