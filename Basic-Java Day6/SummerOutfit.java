import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int degrees = Integer.parseInt(scanner.nextLine());
        String when = scanner.nextLine();

        String sweatshirt = "Sweatshirt";
        String shirt = "Shirt";
        String tShirt = "T-Shirt";
        String swimSuit = "SwimSuit";
        String sneakers = "Sneakers";
        String moccasins = "Moccasins";
        String sandals = "Sandals";
        String barefoot = "Barefoot";

        String outfit = "";
        String shoes = "";

        boolean cold = degrees >= 10 && degrees <= 18;
        boolean warm = degrees >= 18 && degrees <= 24;
        boolean hot = degrees >= 25;


        switch (when) {
            case "Morning":
                if (cold) {
                    outfit = sweatshirt;
                    shoes = sneakers;
                } else if (warm) {
                    outfit = shirt;
                    shoes = moccasins;
                } else if (hot) {
                    outfit = tShirt;
                    shoes = sandals;
                }
                break;


            case "Afternoon":
                if (cold) {
                    outfit = shirt;
                    shoes = moccasins;
                } else if (warm) {
                    outfit = tShirt;
                    shoes = sandals;
                } else if (hot) {
                    outfit = swimSuit;
                    shoes = barefoot;
                }

                break;
            case "Evening":
                if (cold || warm || hot) {
                    outfit = shirt;
                    shoes = moccasins;
                }
                break;
        }
        System.out.printf("It's %d degree, get your %s and %s",degrees, outfit, shoes);
    }
}
