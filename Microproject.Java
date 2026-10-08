import java.util.ArrayList;
import java.util.Scanner;
 
interface Rentable {
    void rent();
    void returnVehicle();
}
 
abstract class Vehicle {
    int id;
    String brand;
    double rent;
    boolean available = true;
 
    Vehicle(int id, String brand, double rent) {
        this.id = id;
        this.brand = brand;
        this.rent = rent;
    }
 
    abstract void display();
}
 
class Car extends Vehicle implements Rentable {
 
    Car(int id, String brand, double rent) {
        super(id, brand, rent);
    }
 
    void display() {
        System.out.println("Car : " + id + " | " + brand +
                " | ₹" + rent + " | Available: " + available);
    }
 
    public void rent() {
        if (available) {
            available = false;
            System.out.println("Car rented successfully!");
        } else {
            System.out.println("Car is already rented.");
        }
    }
 
    public void returnVehicle() {
        available = true;
        System.out.println("Car returned successfully!");
    }
}
 
class Bike extends Vehicle implements Rentable {
 
    Bike(int id, String brand, double rent) {
        super(id, brand, rent);
    }
 
    void display() {
        System.out.println("Bike : " + id + " | " + brand +
                " | ₹" + rent + " | Available: " + available);
    }
 
    public void rent() {
        if (available) {
            available = false;
            System.out.println("Bike rented successfully!");
        } else {
            System.out.println("Bike is already rented.");
        }
    }
 
    public void returnVehicle() {
        available = true;
        System.out.println("Bike returned successfully!");
    }
}
 
class Truck extends Vehicle implements Rentable {
 
    Truck(int id, String brand, double rent) {
        super(id, brand, rent);
    }
 
    void display() {
        System.out.println("Truck : " + id + " | " + brand +
                " | ₹" + rent + " | Available: " + available);
    }
 
    public void rent() {
        if (available) {
            available = false;
            System.out.println("Truck rented successfully!");
        } else {
            System.out.println("Truck is already rented.");
        }
    }
 
    public void returnVehicle() {
        available = true;
        System.out.println("Truck returned successfully!");
    }
}
 
public class VehicleRentalSystem {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        ArrayList<Vehicle> vehicles = new ArrayList<>();
 
        vehicles.add(new Car(101, "Toyota", 2000));
        vehicles.add(new Car(102, "Honda", 1800));
        vehicles.add(new Bike(201, "Yamaha", 800));
        vehicles.add(new Bike(202, "Royal Enfield", 1000));
        vehicles.add(new Truck(301, "Tata", 3000));
 
        int choice;
 
        do {
            System.out.println("\n===== VEHICLE RENTAL SYSTEM =====");
            System.out.println("1. Display Vehicles");
            System.out.println("2. Rent Vehicle");
            System.out.println("3. Return Vehicle");
            System.out.println("4. Calculate Rent");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
 
            choice = sc.nextInt();
 
            switch (choice) {
 
                case 1:
                    System.out.println("\n--- Vehicle Details ---");
                    for (Vehicle v : vehicles)
                        v.display();
                    break;
 
                case 2:
                    System.out.print("Enter Vehicle ID: ");
                    int id = sc.nextInt();
 
                    for (Vehicle v : vehicles) {
                        if (v.id == id) {
                            ((Rentable) v).rent();
                            break;
                        }
                    }
                    break;
 
                case 3:
                    System.out.print("Enter Vehicle ID: ");
                    id = sc.nextInt();
 
                    for (Vehicle v : vehicles) {
                        if (v.id == id) {
                            ((Rentable) v).returnVehicle();
                            break;
                        }
                    }
                    break;
 
                case 4:
                    System.out.print("Enter Vehicle ID: ");
                    id = sc.nextInt();
 
                    System.out.print("Enter number of days: ");
                    int days = sc.nextInt();
 
                    for (Vehicle v : vehicles) {
                        if (v.id == id) {
                            System.out.println(
                                "Total Rent = ₹" + (v.rent * days)
                            );
                            break;
                        }
                    }
                    break;
 
                case 5:
                    System.out.println("Thank you!");
                    break;
 
                default:
                    System.out.println("Invalid choice!");
            }
 
        } while (choice != 5);
 
        sc.close();
    }
}
