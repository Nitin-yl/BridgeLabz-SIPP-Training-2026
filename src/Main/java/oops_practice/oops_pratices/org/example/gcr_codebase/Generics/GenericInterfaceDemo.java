package Main.java.oops_practice.oops_pratices.org.example.gcr_codebase.Generics;

interface Printer<T> {

    void print(T data);
}

class StringPrinter implements Printer<String> {

    @Override
    public void print(String data) {
        System.out.println("String: " + data);
    }
}

class IntegerPrinter implements Printer<Integer> {

    @Override
    public void print(Integer data) {
        System.out.println("Integer: " + data);
    }
}

public class GenericInterfaceDemo {

    public static void main(String[] args) {

        Printer<String> stringPrinter = new StringPrinter();
        stringPrinter.print("Hello Java");

        Printer<Integer> integerPrinter = new IntegerPrinter();
        integerPrinter.print(100);
    }
}