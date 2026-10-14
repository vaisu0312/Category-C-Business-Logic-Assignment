import java.util.Scanner;

public class ParcelShippingDesk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double grandTotal = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double weight = sc.nextDouble();
            double declaredValue = sc.nextDouble();
            double charge = 0;
            double insurance = 0;

            if (type.equals("STANDARD")) {
                charge = 40 + 10 * weight;
            } else if (type.equals("EXPRESS")) {
                charge = 80 + 15 * weight;
                insurance = declaredValue * 0.02;
            } else if (type.equals("FRAGILE")) {
                charge = 40 + 10 * weight + 50;
                insurance = declaredValue * 0.02;
            }

            double total = charge + insurance;
            System.out.printf("%s: Charge=%.2f Insurance=%.2f Total=%.2f%n",
                    type, charge, insurance, total);
            grandTotal += total;
        }

        System.out.printf("Grand Total: %.2f%n", grandTotal);
    }
}
