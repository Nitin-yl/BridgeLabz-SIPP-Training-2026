package Main.java.oops_practice.oops_pratices.org.example.gcr_codebase.Generics;

class Display {

    String value;

    public <T> Display(T value) {
        this.value = value.toString();
    }

    public void show() {
        System.out.println("Value: " + value);
    }
}

public class GenericConstructorDemo {

    public static void main(String[] args) {

        Display d1 = new Display("Java");
        Display d2 = new Display(100);
        Display d3 = new Display(95.5);

        d1.show();
        d2.show();
        d3.show();
    }
}