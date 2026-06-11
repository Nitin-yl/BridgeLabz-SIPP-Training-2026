package Main.java.core_java_practice.core_java.org.example.gcr_codebase.programming_elements.Level1_practice_question;

public class EarthVolume {
    public static void main(String[] args) {
        double radiusKm = 6378;
        double pi = Math.PI;

        double volumeKm3 = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);

        double radiusMiles = radiusKm / 1.6;
        double volumeMiles3 = (4.0 / 3.0) * pi * Math.pow(radiusMiles, 3);

        System.out.println("The volume of earth in cubic kilometers is " +
                volumeKm3 + " and cubic miles is " + volumeMiles3);
    }
}
