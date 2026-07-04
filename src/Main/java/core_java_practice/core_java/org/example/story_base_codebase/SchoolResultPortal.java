package Main.java.core_java_practice.core_java.org.example.story_base_codebase;

import java.io.*;
import java.util.Scanner;

public class SchoolResultPortal {

    public static void main(String[] args) {

        try {
            File inputFile = new File("students.txt");
            Scanner sc = new Scanner(inputFile);

            FileWriter writer = new FileWriter("report.txt", true);

            while (sc.hasNext()) {

                String name = sc.next();
                int m1 = sc.nextInt();
                int m2 = sc.nextInt();
                int m3 = sc.nextInt();

                double average = (m1 + m2 + m3) / 3.0;

                writer.write("Student Name : " + name + "\n");
                writer.write("Marks : " + m1 + " " + m2 + " " + m3 + "\n");
                writer.write("Average : " + average + "\n");
                writer.write("-----------------------------\n");
            }

            sc.close();
            writer.close();

            System.out.println("Report card generated successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("Error: Student file not found.");
        } catch (IOException e) {
            System.out.println("Error while writing to the file.");
        }
    }
}