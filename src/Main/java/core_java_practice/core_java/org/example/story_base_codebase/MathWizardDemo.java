package Main.java.core_java_practice.core_java.org.example.story_base_codebase;

class MathWizard {

    // Instance variable
    int instanceVar = 100;

    // Prime Number
    boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // Factorial for int
    long factorial(int n) {
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    // Factorial for double
    double factorial(double n) {
        double fact = 1;

        for (int i = 1; i <= (int) n; i++) {
            fact *= i;
        }

        return fact;
    }

    // Fibonacci
    void fibonacci(int n) {
        int a = 0, b = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }

        System.out.println();
    }

    // GCD
    int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // LCM
    int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // Power
    long power(int base, int exp) {
        long result = 1;

        for (int i = 1; i <= exp; i++) {
            result *= base;
        }

        return result;
    }

    void showScope() {
        int localVar = 50;

        System.out.println("Local Variable = " + localVar);
        System.out.println("Instance Variable = " + instanceVar);
    }
}


public class MathWizardDemo {
    public static void main(String[] args) {
        MathWizard m = new MathWizard();

        System.out.println("Is 17 Prime? " + m.isPrime(17));

        System.out.println("Factorial = " + m.factorial(5));

        System.out.println("Factorial = " + m.factorial(6.0));

        m.fibonacci(10);

        System.out.println("GCD = " + m.gcd(24, 36));

        System.out.println("LCM = " + m.lcm(24, 36));

        System.out.println("Power = " + m.power(2, 5));

        System.out.println("\nScope Demonstration:");
        m.showScope();
    }
}
