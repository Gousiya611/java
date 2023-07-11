// package assignment;
// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.List;
// class Driver  {
//     private String driverName;
//     private String carModel;
//     private double rating;
//     private int distanceFromCustomer;

//     public Driver (String driverName, String carModel, double rating, int distanceFromCustomer) {
//         this.driverName = driverName;
//         this.carModel = carModel;
//         this.rating = rating;
//         this.distanceFromCustomer = distanceFromCustomer;
//     }

//     public String getDriverName() {
// //         return driverName;
//     }

//     public String getCarModel() {
//         return carModel;
//     }

//     public double getRating() {
//         return rating;
//     }

//     public int getDistanceFromCustomer() {
//         return distanceFromCustomer;
//     }
// }

// class RideBookingSystem {
//     private List<Driver> drivers;

//     public RideBookingSystem() {
//         this.drivers = new ArrayList<>();
//     }

//     public void addDriver(Driver driver) {
//         drivers.add(driver);
//     }

//     public Driver findDriver(String carModel, int totalDistance) {
//         List<Driver> validDrivers = new ArrayList<>();

//         // Filter drivers based on car model and rating
//         for (Driver driver : drivers) {
//             if (driver.getCarModel().equals(carModel) && driver.getRating() >= 4) {
//                 validDrivers.add(driver);
//             }
//         }

//         // Sort valid drivers by distance from the customer
//         Collections.sort(validDrivers, (d1, d2) -> d1.getDistanceFromCustomer() - d2.getDistanceFromCustomer());

//         // Find the closest driver who meets the car model and rating criteria
//         for (Driver driver : validDrivers) {
//             if (driver.getDistanceFromCustomer() <= totalDistance) {
//                 return driver;
//             }
//         }

//         return null;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         // Create the ride booking system
//         RideBookingSystem rideBookingSystem = new RideBookingSystem();

//         // Add drivers to the system
//         rideBookingSystem.addDriver(new Driver("A", "Sedan", 4, 500));
//         rideBookingSystem.addDriver(new Driver("B", "Hatchback", 4.3, 1000));
//         rideBookingSystem.addDriver(new Driver("C", "5-Seater", 4.8, 200));
//         rideBookingSystem.addDriver(new Driver("D", "Sedan", 4.1, 700));
//         rideBookingSystem.addDriver(new Driver("E", "Hatchback", 4.7, 430));

//         // Customer's request
//         String carRequested = "Sedan";
//         int totalDistance = 43;

//         // Find the suitable driver
//         Driver selectedDriver = rideBookingSystem.findDriver(carRequested, totalDistance);

//         // Check if a driver is available
//         if (selectedDriver != null) {
//             System.out.println("Driver " + selectedDriver.getDriverName() + " will get you to the destination.");
//             double fare = totalDistance * 8;
//             System.out.println("Your charge will be Rs " + fare + ".");
//         } else {
//             System.out.println("No driver available for the requested car model and distance.");
//         }
//     }
//  }
    
