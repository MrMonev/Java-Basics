import java.util.Scanner;

public class ProgrammingBook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        double sheetPrice = Double.parseDouble(scan.nextLine());
        double coverPrice = Double.parseDouble(scan.nextLine());
        double discountPercentage = Double.parseDouble(scan.nextLine());
        double designPrice = Double.parseDouble(scan.nextLine());
        double totalPercentige = Double.parseDouble(scan.nextLine());

        int bookPages = 899;
        int bookCover = 2;

        double totalDiscount = 100 - discountPercentage;
        double totalTeamPercentage = 100 - totalPercentige;
        double totalPrice = (sheetPrice * bookPages) + (coverPrice * bookCover);
        totalPrice = totalPrice * totalDiscount / 100;
        totalPrice = totalPrice + designPrice;
        totalPrice = totalPrice * totalTeamPercentage / 100;



        System.out.printf("Avtonom should pay %.2f BGN.",totalPrice);
    }
}