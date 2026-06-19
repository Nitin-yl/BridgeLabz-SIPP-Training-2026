package Main.java.core_java_practice.core_java.org.example.gcr_codebase.Java_Exception_Handling.Level1_practice_question;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesDemo {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("info.txt"))) {

            String firstLine = br.readLine();
            System.out.println(firstLine);

        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}