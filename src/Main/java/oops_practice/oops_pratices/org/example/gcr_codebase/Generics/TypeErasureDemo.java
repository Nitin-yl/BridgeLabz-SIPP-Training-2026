package Main.java.oops_practice.oops_pratices.org.example.gcr_codebase.Generics;

class Container<T> {

    T data;

    public Container(T data) {
        this.data = data;
    }

    public void show() {
        System.out.println("Data: " + data);
    }
}

public class TypeErasureDemo {

    public static <T> void checkType(T value) {

        if (value instanceof String) {
            System.out.println(value + " is a String");
        } else if (value instanceof Integer) {
            System.out.println(value + " is an Integer");
        } else {
            System.out.println(value + " is some other type");
        }
    }

    public static void main(String[] args) {

        Container<String> c1 = new Container<>("Java");
        Container<Integer> c2 = new Container<>(100);

        c1.show();
        c2.show();

        checkType("Hello");
        checkType(50);
        checkType(25.5);
    }
}