import java.util.Scanner;

public class ComputerFirm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int madeSells = Integer.parseInt(scanner.nextLine());

        double allRating = 0.0;
        double salesPrediction = 0.0;

        for (int i = 0; i < madeSells; i++) {
            double number = Double.parseDouble(scanner.nextLine());
            double momentRating = number % 10;
            allRating += momentRating;
            double sales = Math.floor(number / 10);

           if (momentRating == 2) {
               sales = 0;
               salesPrediction += sales;
           } else if (momentRating == 3) {
               sales = sales * 0.50;
               salesPrediction += sales;
           } else if (momentRating == 4) {
               sales = sales * 0.70;
               salesPrediction += sales;
           } else if (momentRating == 5) {
               sales = sales * 0.85;
               salesPrediction += sales;
           } else if (momentRating == 6) {
               sales = sales * 1;
               salesPrediction += sales;
           }

        }
        double totalPrice = Math.floor(allRating) / madeSells;
        System.out.printf("%.2f%n",Math.floor(salesPrediction));
        System.out.printf("%.2f%n",totalPrice);

    }
}





