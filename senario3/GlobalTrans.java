package senario3;

// Base class
class Vehicle {

    protected double distance, weight;

    // Constructor
    public Vehicle(double distance, double weight) {
        this.distance = distance;
        this.weight = weight;
    }

    // Getters and Setters
    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Default implementation returning 0
    public double calculateCost() {
        return 0; // Default implementation
    }
}

// Subclass Truck
class Truck extends Vehicle {

    public Truck(double distance, double weight) {
        super(distance, weight);
    }

    @Override
    public double calculateCost() {
        return (distance * 5 + weight * 2);
    }
}

// Subclass Ship
class Ship extends Vehicle {

    public Ship(double distance, double weight) {
        super(distance, weight);
    }

    @Override
    public double calculateCost() {
        return (distance * 3 + weight * 1.5);
    }
}

// Subclass Airplane
class Airplane extends Vehicle {

    public Airplane(double distance, double weight) {
        super(distance, weight);
    }

    @Override
    public double calculateCost() {
        return (distance * 10 + weight * 5);
    }
}

// Main class
public class GlobalTrans {

    public static void main(String[] args) {
        // Create a list of vehicles
        Vehicle[] vehicles = {
            new Truck(100, 500),
            new Ship(200, 1000),
            new Airplane(300, 200)
        };

        // Calculate and display costs
        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle Type: " + vehicle.getClass().getSimpleName());
            System.out.println("Distance: " + vehicle.getDistance() + " km");
            System.out.println("Weight: " + vehicle.getWeight() + " kg");
            System.out.println("Transport Cost: $" + String.format("%.2f", vehicle.calculateCost()));
            System.out.println();
        }
    }
}
