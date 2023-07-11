import java.util.Scanner;

public class CarBillingSystem {
    public static void main(String[] args) {
        Car[] cars = {
                new Car("Polo Trendline", 8.70),
                new Car("Polo Highline", 10.09),
                new Car("Virtus Trendline", 11.05),
                new Car("Virtus Highline", 13.08),
                new Car("Taigun Trendline", 14.89),
                new Car("Taigun Highline", 15.42),
                new Car("Taigun Topline", 17.71)
        };

        Scanner scanner = new Scanner(System.in);
        BillingProcess billingProcess = new BillingProcess();

        System.out.println("Available Car Models:");
        for (int i = 0; i < cars.length; i++) {
            System.out.println((i + 1) + ". " + cars[i].getModel());
        }

        // System.out.print("Enter the Car Model Number: ");
        // int carModelNumber = scanner.nextInt();

        // Car selectedCar = cars[carModelNumber - 1];
        // billingProcess.selectCar(selectedCar);

        System.out.print("Opt for Insurance (Y/N): ");
        String optInsuranceStr = scanner.next();
        boolean optInsurance = optInsuranceStr.equalsIgnoreCase("Y");
        billingProcess.setInsuranceOption(optInsurance);

        System.out.print("Opt for Additional Accessories (Y/N): ");
        String optAdditionalAccessoriesStr = scanner.next();
        boolean optAdditionalAccessories = optAdditionalAccessoriesStr.equalsIgnoreCase("Y");
        billingProcess.setAdditionalAccessoriesOption(optAdditionalAccessories);
        scanner.close();
        if (optInsurance || optAdditionalAccessories) {
            System.out.print("Enter Dealer Discount Amount (in Rs): ");
            double discount = scanner.nextDouble();
            billingProcess.setDiscount(discount);
        } else {
            billingProcess.setDiscount(0);
        }

        System.out.println("\nCalculating Total Amount...");
        billingProcess.calculateTotalAmount();
    }
}
    
