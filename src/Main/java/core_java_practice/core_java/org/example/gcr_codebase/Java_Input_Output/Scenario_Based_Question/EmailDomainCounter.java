package Main.java.core_java_practice.core_java.org.example.gcr_codebase.Java_Input_Output.Scenario_Based_Question;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EmailDomainCounter {

    public static void main(String[] args) {

        String[] domains = new String[100];
        int count = 0;

        int gmailCount = 0;
        int yahooCount = 0;
        int otherCount = 0;

        try (BufferedReader br =
                     new BufferedReader(new FileReader("emails.txt"))) {

            String email;

            while ((email = br.readLine()) != null) {

                String domain = email.substring(email.indexOf("@") + 1);

                domains[count++] = domain;

                if (domain.equalsIgnoreCase("gmail.com")) {
                    gmailCount++;
                } else if (domain.equalsIgnoreCase("yahoo.com")) {
                    yahooCount++;
                } else {
                    otherCount++;
                }
            }

            System.out.println("Domains Found:");
            for (int i = 0; i < count; i++) {
                System.out.println(domains[i]);
            }

            System.out.println("\nGmail Users = " + gmailCount);
            System.out.println("Yahoo Users = " + yahooCount);
            System.out.println("Other Users = " + otherCount);

        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}