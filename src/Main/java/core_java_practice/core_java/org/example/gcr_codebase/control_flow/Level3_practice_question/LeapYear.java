package Main.java.core_java_practice.core_java.org.example.gcr_codebase.control_flow.Level3_practice_question;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if (year < 1582) {
            System.out.println("Invalid Year. Enter year >= 1582");
        } else if (year % 400 == 0) {
            System.out.println("Year is a Leap Year");
        } else if (year % 100 == 0) {
            System.out.println("Year is not a Leap Year");
        } else if (year % 4 == 0) {
            System.out.println("Year is a Leap Year");
        } else {
            System.out.println("Year is not a Leap Year");
        }

        if (year >= 1582 &&
                ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println("Leap Year (using single if)");
        } else {
            System.out.println("Not a Leap Year (using single if)");
        }

        sc.close();
    }

}
