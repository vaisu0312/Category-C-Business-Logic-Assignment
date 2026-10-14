import java.util.Scanner;

public class CityCabFareMeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String cab = sc.next();
            double distance = sc.nextDouble();
            String time = sc.next();

            if (time.equals("NIGHT") && cab.equals("MINI")) {
                System.out.println(cab + ": night service not available");
                continue;
            }

            double rate = 0;
            if (cab.equals("MINI")) {
                rate = 10;
            } else if (cab.equals("SEDAN")) {
                rate = 14;
            } else if (cab.equals("SUV")) {
                rate = 18;
            }

            double fare = Math.max(100, distance * rate);
            if (time.equals("NIGHT")) {
                fare *= 1.20;
            }

            System.out.printf("%s: %.2f%n", cab, fare);
            total += fare;
        }

        System.out.printf("Total: %.2f%n", total);
    }
}
