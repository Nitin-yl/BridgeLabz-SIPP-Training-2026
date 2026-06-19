package Main.java.core_java_practice.core_java.org.example.gcr_codebase.Java_Exception_Handling.Level1_practice_question;

import java.io.*;

public class FileReaderExample {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
