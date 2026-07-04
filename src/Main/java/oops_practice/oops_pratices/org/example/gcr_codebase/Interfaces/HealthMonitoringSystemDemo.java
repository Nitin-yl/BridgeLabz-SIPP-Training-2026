package Main.java.oops_practice.oops_pratices.org.example.gcr_codebase.Interfaces;

interface HeartRateMonitor {

    void checkHeartRate(String patientName);

    default void displayHealthTips() {
        System.out.println("Heart Health Tip: Exercise regularly and eat healthy.");
    }
}

interface TemperatureMonitor {

    void checkTemperature(String patientName);

    default void displayHealthTips() {
        System.out.println("Temperature Tip: Drink plenty of water and rest well.");
    }

    static boolean isPatientIdValid(String patientId) {
        return patientId.length() == 6;
    }
}

class HealthMonitoringSystem implements HeartRateMonitor, TemperatureMonitor {

    @Override
    public void checkHeartRate(String patientName) {
        System.out.println("Heart Rate of " + patientName + " : Normal (72 BPM)");
    }

    @Override
    public void checkTemperature(String patientName) {
        System.out.println("Temperature of " + patientName + " : Normal (98.6°F)");
    }

    @Override
    public void displayHealthTips() {
        HeartRateMonitor.super.displayHealthTips();
        TemperatureMonitor.super.displayHealthTips();
    }
}

public class HealthMonitoringSystemDemo {

    public static void main(String[] args) {

        String[] patientNames = {
                "Nitin",
                "Rahul",
                "Priya",
                "Aman"
        };

        String[] patientIds = {
                "P12345",
                "AB123",
                "X56789",
                "Q1234"
        };

        HealthMonitoringSystem system = new HealthMonitoringSystem();

        System.out.println("Health Tips:");
        system.displayHealthTips();

        System.out.println("\nHealth Report:");

        for (int i = 0; i < patientNames.length; i++) {

            System.out.println("\nPatient: " + patientNames[i]);

            if (TemperatureMonitor.isPatientIdValid(patientIds[i])) {

                System.out.println("Patient ID: " + patientIds[i] + " (Valid)");

                system.checkHeartRate(patientNames[i]);
                system.checkTemperature(patientNames[i]);

                System.out.println("Final Report: Patient is Healthy.");
            } else {

                System.out.println("Patient ID: " + patientIds[i] + " (Invalid)");
                System.out.println("Final Report: Cannot Generate Report.");
            }
        }
    }
}