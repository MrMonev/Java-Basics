import java.util.Scanner;

public class SumiraneNaChisla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        int leftSum = 0 ;
        for (int i = 1; i <= n ; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());

            leftSum = leftSum + currentNum;

        }

        int right = 0;
        for (int i = 1; i <= n ; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());

            right =  right + currentNum;

        }
        if (leftSum == right) {
            System.out.printf("Yes", leftSum);

            } else {
                System.out.printf("No", right);
            }
        }
    }
