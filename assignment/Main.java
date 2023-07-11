
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         // Create the ride booking system
//         Scanner sc = new Scanner(System.in);
//         Scanner scan = new Scanner(System.in);
//         RideBookingSystem rideBookingSystem = new RideBookingSystem();

//         // Add drivers to the system
//         rideBookingSystem.addDriver(new Driver("A", "Sedan", 4, 500));
//         rideBookingSystem.addDriver(new Driver("B", "Hatchback", 4.3, 1000));
//         rideBookingSystem.addDriver(new Driver("C", "5-Seater", 4.8, 200));
//         rideBookingSystem.addDriver(new Driver("D", "Sedan", 4.1, 700));
//         rideBookingSystem.addDriver(new Driver("E", "Hatchback", 4.7, 430));

//         // Customer's request

//         String carRequested;
//         int totalDistance;
//         System.out.println("Customer Ride Distance:");
//         totalDistance= sc.nextInt();
//         // System.out.println(totalDistance);
//         System.out.println("carRequested:");
//         carRequested=scan.nextLine();
//         // System.out.println(carRequested);
//         sc.close();
//         scan.close();

//         // Find the suitable driver
//         Driver selectedDriver = rideBookingSystem.findDriver(carRequested, totalDistance);

//         // Check if a driver is available
//         if (selectedDriver != null) {
//             System.out.println("Driver " + selectedDriver.getDriverName() + " will get you to the destination.");
//             double fare = totalDistance * 8;
//             System.out.println("Your charge will be Rs " + fare + ".");
//         } 
//         else 
//         {
//             System.out.println("No driver available for the requested car model and distance.");
//         }
//     }
// }
    