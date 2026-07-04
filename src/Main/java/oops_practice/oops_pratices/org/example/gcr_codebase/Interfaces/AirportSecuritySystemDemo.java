package Main.java.oops_practice.oops_pratices.org.example.gcr_codebase.Interfaces;

interface LuggageScanner {

    void scanLuggage(String passengerName);

    default void displaySecurityGuidelines() {
        System.out.println("Luggage Guidelines: No dangerous items allowed.");
    }
}

interface PassportVerifier {

    void verifyPassport(String passportNo);

    default void displaySecurityGuidelines() {
        System.out.println("Passport Guidelines: Carry a valid passport.");
    }

    static boolean isPassportNumberValid(String passportNo) {
        return passportNo.length() == 8;
    }
}

class AirportSecuritySystem implements LuggageScanner, PassportVerifier {

    @Override
    public void scanLuggage(String passengerName) {
        System.out.println("Luggage scanned for: " + passengerName);
    }

    @Override
    public void verifyPassport(String passportNo) {
        if (PassportVerifier.isPassportNumberValid(passportNo)) {
            System.out.println("Passport Verified");
        } else {
            System.out.println("Invalid Passport");
        }
    }

    // Resolve default method conflict
    @Override
    public void displaySecurityGuidelines() {
        LuggageScanner.super.displaySecurityGuidelines();
        PassportVerifier.super.displaySecurityGuidelines();
    }
}

public class AirportSecuritySystemDemo {

    public static void main(String[] args) {

        String[] passengers = {
                "Nitin",
                "Rahul",
                "Priya",
                "Aman"
        };

        String[] passportNumbers = {
                "A1234567",
                "B12345",
                "P9876543",
                "X123456"
        };

        AirportSecuritySystem security = new AirportSecuritySystem();

        System.out.println("Security Guidelines:");
        security.displaySecurityGuidelines();

        System.out.println("\nPassenger Verification:");

        for (int i = 0; i < passengers.length; i++) {

            security.scanLuggage(passengers[i]);

            if (PassportVerifier.isPassportNumberValid(passportNumbers[i])) {
                System.out.println("Passenger: " + passengers[i] + " -> Can Board");
            } else {
                System.out.println("Passenger: " + passengers[i] + " -> Cannot Board");
            }

            System.out.println();
        }
    }
}