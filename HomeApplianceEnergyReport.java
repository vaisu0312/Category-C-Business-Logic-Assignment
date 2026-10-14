import java.util.Scanner;

public class HomeApplianceEnergyReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double totalCost = 0;

        for (int i = 0; i < n; i++) {
            String appliance = sc.next();
            double hours = 0;
            boolean saver = false;

            if (appliance.equals("FRIDGE")) {
                hours = sc.nextDouble();
            } else if (appliance.equals("AC")) {
                hours = sc.nextDouble();
                saver = sc.next().equals("SAVER");
            } else if (appliance.equals("TV")) {
                hours = sc.nextDouble();
            } else if (appliance.equals("WASHER")) {
                hours = sc.nextDouble();
                saver = sc.next().equals("SAVER");
            }

            double power = 0;
            if (appliance.equals("FRIDGE")) {
                power = 150;
            } else if (appliance.equals("AC")) {
                power = 1500;
            } else if (appliance.equals("TV")) {
                power = 100;
            } else if (appliance.equals("WASHER")) {
                power = 500;
            }

            if (saver) {
                if (appliance.equals("AC") || appliance.equals("WASHER")) {
                    power *= 0.75;
                } else {
                    System.out.println(appliance + ": saver mode not supported");
                    continue;
                }
            }

            double units = power * hours / 1000;
            double cost = units * 8;
            System.out.printf("%s: Units=%.2f Cost=%.2f%n", appliance, units, cost);
            totalCost += cost;
        }

        System.out.printf("Total Cost: %.2f%n", totalCost);
    }
}
