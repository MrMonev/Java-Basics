import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int Width = Integer.parseInt(scanner.nextLine());
        int Height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());
        int volumeCm = Height * length * Width;
        double volumeLitters = volumeCm * 0.001;
        double needLitters = volumeLitters * (1 - (percent / 100));
        System.out.println(needLitters);

    }
}