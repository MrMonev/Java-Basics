import java.util.Scanner;

public class PuppyCare {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int kg = Integer.parseInt(scanner.nextLine());

        int foodAte = 0;

        String comm = scanner.nextLine();

        while (!comm.equals("Adopted")) {

            int grams = Integer.parseInt(comm);
            foodAte += grams;


            comm = scanner.nextLine();
        }

        if (foodAte <= kg * 1000) {

            int difference = kg * 1000 - foodAte;
            System.out.printf("Food is enough! Leftovers: %d  grams.", difference);
        } else {
            int difference = foodAte - (kg * 1000);
            System.out.printf("Food is not enough. You need %d grams more.", difference);
        }
    }
}
