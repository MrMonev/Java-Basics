import java.util.Scanner;

public class CatFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalCats = Integer.parseInt(scanner.nextLine());

        double oneKilo = 12.45;

        int groupOne = 0;
        int  groupTwo = 0;
        int  groupThree = 0;

        double catsFoodGm = 0;

        for (int i = 1; i <= totalCats; i++) {
            double eatFood = Integer.parseInt(scanner.nextLine());
            catsFoodGm = eatFood + catsFoodGm;

            if (eatFood >= 100 && eatFood < 200) {
                groupOne++;

            }
            else if (eatFood>= 200 && eatFood<300) {
                groupTwo++;

            } else if (eatFood>= 300 && eatFood<400){
                groupThree++;

            }


        }
        double finalPrice = ((catsFoodGm / 1000) * oneKilo);

        System.out.printf("Group 1: %s cats.%n", groupOne);
        System.out.printf("Group 2: %s cats.%n", groupTwo);
        System.out.printf("Group 3: %s cats.%n", groupThree);
        System.out.printf("Price for food per day: %.2f lv.", finalPrice);

    }
}