import java.util.Scanner;

public class PinCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= firstNum; i++) {

            for (int j = 2; j <= secondNum; j++) {

                for (int k = 1; k <= thirdNum; k++) {

                    if (i % 2 == 0 && k % 2 == 0) {
                        boolean isNotPrime = false;



                        for (int l = 2; l <= j / 2; l++) {
                            if (j % l == 0) {

                                isNotPrime = true;
                                break;

                            }

                        }
                        if (!isNotPrime) {
                            System.out.println("" + i + j + k);
                        }




                    }

                }
            }

        }

    }
}
