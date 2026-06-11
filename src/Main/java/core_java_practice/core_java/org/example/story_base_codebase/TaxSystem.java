package Main.java.core_java_practice.core_java.org.example.story_base_codebase;

public class TaxSystem {

    public static void main(String[] args) {

        double[] incomes = {
                8000, 12000, 25000, 55000, 70000,
                9000, 45000, 60000, 15000, 52000
        };

        double totalTax = 0;

        for (int i = 0; i < incomes.length; i++) {

            double income = incomes[i];
            double tax;
            String taxBracket;

            if (income < 10000) {
                tax = income * 0.05;
                taxBracket = "5% Tax Bracket";
            } else if (income <= 50000) {
                tax = income * 0.15;
                taxBracket = "15% Tax Bracket";
            } else {
                tax = income * 0.30;
                taxBracket = "30% Tax Bracket";
            }

            totalTax += tax;

            System.out.println("Citizen " + (i + 1));
            System.out.println("Income:" + income);
            System.out.println("Tax Bracket: " + taxBracket);
            System.out.println("Tax Amount:" + tax);
            System.out.println();
        }

        System.out.println("Total Tax Collected:" + totalTax);
    }
}