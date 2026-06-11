package Main.java.core_java_practice.core_java.org.example.gcr_codebase.programming_elements.Level1_practice_question;

public class UniversityFeeDiscount {
    public static void main(String[] args) {
        double fee = 125000;
        double discountPercent = 10;

        double discount = (fee * discountPercent) / 100;
        double discountedPrice = fee - discount;

        System.out.println("The original fee is INR " + fee);
        System.out.println("The discount amount is INR " + discount);
        System.out.println("The discounted fee to be paid is INR " + discountedPrice);
    }
}
