package Main.java.oops_practice.oops_pratices.org.example.story_base_codebase;

interface Trackable {

    void logActivity();

    default void resetData() {
        System.out.println("Fitness data has been reset.");
    }
}

interface Reportable {

    void generateReport();
}

interface Notifiable {

    void sendAlert();
}

class FitnessDevice implements Trackable, Reportable, Notifiable {

    @Override
    public void logActivity() {
        System.out.println("Activity logged successfully.");
    }

    @Override
    public void generateReport() {
        System.out.println("Fitness report generated.");
    }

    @Override
    public void sendAlert() {
        System.out.println("Workout reminder sent.");
    }
}

public class FitnessTrackerDemo {

    public static void main(String[] args) {

        FitnessDevice device = new FitnessDevice();

        device.logActivity();
        device.generateReport();
        device.sendAlert();
        device.resetData();

        System.out.println();
        System.out.println("FitnessDevice implements multiple interfaces:");
        System.out.println("Trackable");
        System.out.println("Reportable");
        System.out.println("Notifiable");
        System.out.println();
        System.out.println("Java supports multiple inheritance through interfaces,");
        System.out.println("but not through classes.");
    }
}