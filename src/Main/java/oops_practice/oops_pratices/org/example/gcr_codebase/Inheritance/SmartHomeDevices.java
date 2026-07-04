package Main.java.oops_practice.oops_pratices.org.example.gcr_codebase.Inheritance;

class Device {

    protected String deviceId;
    protected String status;

    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }
}

class Thermostat extends Device {

    private int temperatureSetting;

    public Thermostat(String deviceId, String status, int temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

public class SmartHomeDevices {

    public static void main(String[] args) {

        Thermostat thermostat = new Thermostat("TH101", "ON", 24);

        thermostat.displayStatus();
    }
}