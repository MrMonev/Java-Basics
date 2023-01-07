import java.util.Scanner;

public class CatClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maznini = Integer.parseInt(scanner.nextLine());
        int protein = Integer.parseInt(scanner.nextLine());
        int vuglehidrati = Integer.parseInt(scanner.nextLine());
        int totalKalories = Integer.parseInt(scanner.nextLine());
        int procentVoda = Integer.parseInt(scanner.nextLine());


        double totalFood = 0.0;
        double kaloriiZaGramFood = 0.0;
        double procent = 100;
        double calorii = 0.0;
        double finalGram = 0.0;
        double finalRezult = 0.0;
        double totalRezult = 0.0;

        double totalMaz = 0.0;
        double totalProteint = 0.0;
        double totalVug = 0.0;

        totalMaz = maznini / 100.0 *  totalKalories / 9.0;
        totalProteint = protein /  100.0 * totalKalories / 4.0;
        totalVug = vuglehidrati / 100.0 * totalKalories / 4.0;

        totalFood = totalMaz + totalProteint + totalVug;
        kaloriiZaGramFood = totalKalories/ totalFood;
        finalRezult = procentVoda - 100;
        Math.abs(finalRezult);
        totalRezult = finalRezult / 100 * kaloriiZaGramFood;






        System.out.printf("%.4f",Math.abs(totalRezult));




    }
}
