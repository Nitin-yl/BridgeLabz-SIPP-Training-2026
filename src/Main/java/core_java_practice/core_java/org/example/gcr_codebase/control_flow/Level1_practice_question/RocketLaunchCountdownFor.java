package Main.java.core_java_practice.core_java.org.example.gcr_codebase.control_flow.Level1_practice_question;

import java.util.Scanner;

public class RocketLaunchCountdownFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter countdown value: ");
        int counter = sc.nextInt();

        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("Rocket Launch!");

        sc.close();
    }
}
