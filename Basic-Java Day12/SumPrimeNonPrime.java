import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int primeSum = 0;
        int nonPrimeSum = 0;

        String input = scanner.nextLine();
        while (!"stop".equals(input)) {
            boolean  isNoPrimeNum = false;
            int num = Integer.parseInt(input);

            if (num < 0 ) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isNoPrimeNum = true;
                    break;

                }
            }

            if ( isNoPrimeNum) {
                nonPrimeSum += num;
            } else {
                primeSum += num;
            }


            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n", primeSum);
        System.out.printf("Sum of all non prime numbers is: %d",nonPrimeSum);
    }
}
