package Main.java.core_java_practice.core_java.org.example.gcr_codebase.Java_Exception_Handling.Level1_practice_question;

public class ExceptionPropagationDemo {

    public static void method1() {
        int result = 10 / 0;
    }

    public static void method2() {
        method1();
    }

    public static void main(String[] args) {

        try {
            method2();
        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }
}