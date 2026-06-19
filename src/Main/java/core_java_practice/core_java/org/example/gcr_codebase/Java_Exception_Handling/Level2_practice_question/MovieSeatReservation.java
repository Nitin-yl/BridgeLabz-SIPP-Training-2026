package Main.java.core_java_practice.core_java.org.example.gcr_codebase.Java_Exception_Handling.Level2_practice_question;

public class MovieSeatReservation {

    static int[] seats = {101, 102, 103, 104, 105};

    public static int getSeat(int index) {
        try {
            return seats[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid seat position!");
            return -1;
        }
    }

    public static void main(String[] args) {

        int seatNumber = getSeat(8);

        if (seatNumber != -1) {
            System.out.println("Seat Number: " + seatNumber);
        } else {
            System.out.println("Seat not available.");
        }
    }
}