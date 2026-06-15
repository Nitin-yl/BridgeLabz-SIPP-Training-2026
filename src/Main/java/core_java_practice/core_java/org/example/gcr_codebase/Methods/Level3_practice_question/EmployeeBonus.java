package Main.java.core_java_practice.core_java.org.example.gcr_codebase.Methods.Level3_practice_question;

public class EmployeeBonus {
    public static int[][] generateEmployeeData() {
        int[][] data = new int[10][2];

        for (int i = 0; i < 10; i++) {
            data[i][0] = (int)(Math.random() * 90000) + 10000;
            data[i][1] = (int)(Math.random() * 10) + 1;
        }

        return data;
    }

    public static double[][] calculateBonus(int[][] data) {
        double[][] result = new double[10][2];

        for (int i = 0; i < data.length; i++) {
            double salary = data[i][0];
            int years = data[i][1];

            double bonus;

            if (years > 5) {
                bonus = salary * 0.05;
            } else {
                bonus = salary * 0.02;
            }

            result[i][0] = bonus;
            result[i][1] = salary + bonus;
        }

        return result;
    }

    public static void displayReport(int[][] data, double[][] result) {

        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.printf("%-5s %-12s %-10s %-12s %-12s%n",
                "ID", "OldSalary", "Years", "Bonus", "NewSalary");

        for (int i = 0; i < data.length; i++) {

            totalOldSalary += data[i][0];
            totalBonus += result[i][0];
            totalNewSalary += result[i][1];

            System.out.printf("%-5d %-12d %-10d %-12.2f %-12.2f%n",
                    (i + 1),
                    data[i][0],
                    data[i][1],
                    result[i][0],
                    result[i][1]);
        }

        System.out.println();
        System.out.printf("Total Old Salary : %.2f%n", totalOldSalary);
        System.out.printf("Total Bonus      : %.2f%n", totalBonus);
        System.out.printf("Total New Salary : %.2f%n", totalNewSalary);
    }

    public static void main(String[] args) {

        int[][] employeeData = generateEmployeeData();
        double[][] bonusData = calculateBonus(employeeData);

        displayReport(employeeData, bonusData);
    }
}
