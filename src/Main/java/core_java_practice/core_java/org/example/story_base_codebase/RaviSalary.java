package Main.java.core_java_practice.core_java.org.example.story_base_codebase;

public class RaviSalary {
    public static void main(String[] args) {

        String name = "Ravi";
        int age = 22;
        String rank = "Member";
        double salary = 50000;
        float membershipFee = 1500.50f;

        double bonus = salary * 0.12;

        int annualBonus = (int) bonus;

        System.out.println("Welcome Card");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Rank: " + rank);
        System.out.println("Salary:" + salary);
        System.out.println("Membership Fee:" + membershipFee);
        System.out.println("Annual Bonus: " + annualBonus);
    }
}
