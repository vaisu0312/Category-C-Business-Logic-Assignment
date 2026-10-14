import java.util.Scanner;

public class MovieTicketCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String seat = sc.next();
            int count = sc.nextInt();
            double price = 0;

            if (seat.equals("REGULAR")) {
                price = 150;
            } else if (seat.equals("PREMIUM")) {
                price = 250;
            } else if (seat.equals("RECLINER")) {
                price = 400;
            }

            double amount = count * (price + 20);
            System.out.printf("%s: %.2f%n", seat, amount);
            total += amount;
        }

        System.out.printf("Total: %.2f%n", total);
    }
}
