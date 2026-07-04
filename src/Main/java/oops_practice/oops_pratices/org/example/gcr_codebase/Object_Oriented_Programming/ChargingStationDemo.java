package Main.java.oops_practice.oops_pratices.org.example.gcr_codebase.Object_Oriented_Programming;

class ChargingStation {

    static int totalStations = 0;
    static double electricityRate = 8.5;

    private String stationId;
    private double unitsConsumed;

    public ChargingStation(String stationId, double unitsConsumed) {
        this.stationId = stationId;
        this.unitsConsumed = unitsConsumed;
        totalStations++;
    }

    public double calculateBill() {
        return unitsConsumed * electricityRate;
    }

    public void displayStationDetails() {
        System.out.println("Station ID: " + stationId);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Electricity Rate: " + electricityRate);
        System.out.println("Bill: " + calculateBill());
        System.out.println();
    }
}

public class ChargingStationDemo {

    public static void main(String[] args) {

        ChargingStation s1 = new ChargingStation("CS101", 120);
        ChargingStation s2 = new ChargingStation("CS102", 150);
        ChargingStation s3 = new ChargingStation("CS103", 100);
        ChargingStation s4 = new ChargingStation("CS104", 180);
        ChargingStation s5 = new ChargingStation("CS105", 90);

        System.out.println("Bills with Initial Electricity Rate");
        s1.displayStationDetails();
        s2.displayStationDetails();
        s3.displayStationDetails();
        s4.displayStationDetails();
        s5.displayStationDetails();

        ChargingStation.electricityRate = 10.0;

        System.out.println("Bills After Electricity Rate Change");
        s1.displayStationDetails();
        s2.displayStationDetails();
        s3.displayStationDetails();
        s4.displayStationDetails();
        s5.displayStationDetails();

        System.out.println("Total Charging Stations: " + ChargingStation.totalStations);
    }
}