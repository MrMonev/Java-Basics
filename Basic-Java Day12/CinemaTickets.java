import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int standardCount = 0;
        int kidCount = 0;
        int studentCount = 0;
        int totalTickets = 0;


        String input = scanner.nextLine();
        while (!"Finish".equals(input)) {
            String movieName = input;
            int freeSeats = Integer.parseInt(scanner.nextLine());

            int currentTicketsCount = 0;

            input = scanner.nextLine();
            while (!"End".equals(input)) {
                String ticketType = input;
                currentTicketsCount++;



                switch (ticketType) {
                    case "standard":
                        standardCount++;
                        break;

                    case "kid":
                        kidCount++;
                        break;

                    case "student":
                        studentCount++;
                        break;
                }

                if (currentTicketsCount >= freeSeats) {
                    break;
                }



                input = scanner.nextLine();
            }
            totalTickets += currentTicketsCount;
            System.out.printf("%s - %.2f%% full.%n",movieName, 100.0 * currentTicketsCount / freeSeats);


            input = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", 100.0 * studentCount / totalTickets);
        System.out.printf("%.2f%% standard tickets.%n", 100.0 * standardCount / totalTickets);
        System.out.printf("%.2f%% kids tickets.%n", 100.0 * kidCount / totalTickets);
    }
}
