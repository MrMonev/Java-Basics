import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < n; i++) {
            int number =  Integer.parseInt(scanner.nextLine());
           leftSum += number;
            
        }
        for (int i = 0; i < n; i++) {
            int number =  Integer.parseInt(scanner.nextLine());
            rightSum += number;
        }
        if (rightSum == leftSum) {
            System.out.println("Yes, sum = " + rightSum);
        } else {
            System.out.println("No, diff = " + Math.abs(rightSum - leftSum));
        }
    }
}
