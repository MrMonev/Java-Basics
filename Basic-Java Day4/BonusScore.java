import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numer = Integer.parseInt(scanner.nextLine());

        double bonus = 0;

        if (numer <= 100) {
            bonus = 5;
        } else if (numer > 1000) {
            bonus = numer * 0.1;
        }else {
            bonus = numer * 0.2;
        }
        if (numer % 2 == 0) {
            bonus = bonus + 1;
        } else if (numer % 10 == 5) {
            bonus = bonus + 2;

        }
        System.out.println(bonus);
        System.out.println(numer + bonus);


    }
}