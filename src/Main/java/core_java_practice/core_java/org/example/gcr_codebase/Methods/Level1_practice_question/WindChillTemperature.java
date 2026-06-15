package Main.java.core_java_practice.core_java.org.example.gcr_codebase.Methods.Level1_practice_question;

import java.util.Scanner;

public class WindChillTemperature {
    public static double calculateWindChill(double temperature, double windSpeed) {

        return 35.74 + (0.6215 * temperature)
                - (35.75 * Math.pow(windSpeed, 0.16))
                + (0.4275 * temperature * Math.pow(windSpeed, 0.16));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature (°F): ");
        double temperature = sc.nextDouble();

        System.out.print("Enter wind speed (mph): ");
        double windSpeed = sc.nextDouble();

        double windChill = calculateWindChill(temperature, windSpeed);

        System.out.printf("Wind Chill Temperature = %.2f°F%n", windChill);

        sc.close();
    }
}
