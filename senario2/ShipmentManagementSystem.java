package senario2;

// Base class
abstract class Shipment {

    protected int shipmentID;
    protected double weight; // Weight in kilograms
    protected String destination;

    // Constructor
    public Shipment(int shipmentID, double weight, String destination) {
        this.shipmentID = shipmentID;
        this.weight = weight;
        this.destination = destination;
    }

    // Getters and Setters
    public int getShipmentID() {
        return shipmentID;
    }

    public void setShipmentID(int shipmentID) {
        this.shipmentID = shipmentID;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    // Abstract method to calculate total cost
    public abstract double calculateTotalCost(double shipmentCost);

}

// DomesticShipment class
class DomesticShipment extends Shipment {

    private String region;

    // Constructor
    public DomesticShipment(int shipmentID, double weight, String destination, String region) {
        super(shipmentID, weight, destination);
        this.region = region;
    }

    // Getter and Setter for region
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    // Calculate total cost including a 5% tax
    @Override
    public double calculateTotalCost(double shipmentCost) {
        return shipmentCost + (shipmentCost * 0.05); // 5% tax
    }

}

// InternationalShipment class
class InternationalShipment extends Shipment {

    private double customsFee;
    private double insuranceFee;

    // Constructor
    public InternationalShipment(int shipmentID, double weight, String destination, double customsFee, double insuranceFee) {
        super(shipmentID, weight, destination);
        this.customsFee = customsFee;
        this.insuranceFee = insuranceFee;
    }

    // Getters and Setters for customs and insurance fees
    public double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(double customsFee) {
        this.customsFee = customsFee;
    }

    public double getInsuranceFee() {
        return insuranceFee;
    }

    public void setInsuranceFee(double insuranceFee) {
        this.insuranceFee = insuranceFee;
    }

    // Calculate total cost including a 15% tax
    @Override
    public double calculateTotalCost(double shipmentCost) {
        return shipmentCost + customsFee + insuranceFee + (shipmentCost * 0.15); // 15% tax
    }

}

// Main class
public class ShipmentManagementSystem {

    public static void main(String[] args) {
        double shipmentCost = 500; // Assumed base shipment cost
        // Creating a DomesticShipment instance
        DomesticShipment domesticShipment = new DomesticShipment(101, 50, "New York", "North");
        System.out.println("Total Cost: $" + domesticShipment.calculateTotalCost(shipmentCost));

        // Creating an InternationalShipment instance
        InternationalShipment internationalShipment = new InternationalShipment(102, 100, "London", 50, 25);
        System.out.println("Total Cost: $" + internationalShipment.calculateTotalCost(shipmentCost));
    }
}
