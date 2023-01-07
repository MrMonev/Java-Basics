import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());

        int musala = 0;
        int montlank = 0;
        int kilimanjaro = 0;
        int k2 = 0;
        int everest = 0;

        int totalPeople = 0;



        for (int i = 0; i < people; i++) {
            int howManyPeople = Integer.parseInt(scanner.nextLine());
            totalPeople += howManyPeople;
            if (howManyPeople <= 5) {
                musala += howManyPeople;

            } else if (howManyPeople <= 12 ) {
                montlank += howManyPeople;

            }else if (howManyPeople <= 25) {
                kilimanjaro += howManyPeople;

            }else if (howManyPeople <= 40) {
                k2 += howManyPeople;

            } else  {
                everest += howManyPeople;
            }
        }
        System.out.printf("%.2f%%%n ", 100.0 * musala / totalPeople);
        System.out.printf("%.2f%%%n ", 100.0 * montlank / totalPeople);
        System.out.printf("%.2f%%%n ", 100.0 * kilimanjaro / totalPeople);
        System.out.printf("%.2f%%%n ", 100.0 * k2 / totalPeople);
        System.out.printf("%.2f%%%n ", 100.0 * everest / totalPeople);


    }
}