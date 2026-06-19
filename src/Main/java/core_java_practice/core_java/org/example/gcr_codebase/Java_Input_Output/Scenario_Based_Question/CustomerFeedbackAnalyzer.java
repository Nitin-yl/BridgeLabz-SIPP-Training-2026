package Main.java.core_java_practice.core_java.org.example.gcr_codebase.Java_Input_Output.Scenario_Based_Question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CustomerFeedbackAnalyzer {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        int goodCount = 0;

        try {

            System.out.println("Enter 5 feedback messages:");

            for (int i = 1; i <= 5; i++) {

                String feedback = br.readLine();

                if (feedback.toLowerCase().contains("good")) {
                    goodCount++;
                }
            }

            System.out.println("Good Feedback Count = " + goodCount);

        } catch (IOException e) {
            System.out.println("Error reading input.");
        }
    }
}