package Main.java.core_java_practice.core_java.org.example.gcr_codebase.programming_elements.Level1_practice_question;

import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double distanceInFeet = input.nextDouble();

        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;

        System.out.println("The distance in yards is " + distanceInYards +
                " and the distance in miles is " + distanceInMiles);

        input.close();
    }
}
