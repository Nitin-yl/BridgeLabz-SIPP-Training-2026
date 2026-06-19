package Main.java.core_java_practice.core_java.org.example.gcr_codebase.Java_Input_Output.Scenario_Based_Question;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DailyExpenseLogger {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try (BufferedWriter bw =
                     new BufferedWriter(new FileWriter("expenses.txt", true))) {

            System.out.print("Enter Expense Category: ");
            String category = sc.nextLine();

            System.out.print("Enter Amount: ");
            double amount = sc.nextDouble();

            bw.write(category + " - " + amount);
            bw.newLine();

            System.out.println("Expense saved successfully.");

        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }

        sc.close();
    }
}