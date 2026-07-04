package Main.java.oops_practice.oops_pratices.org.example.gcr_codebase.Generics;

class Box<T> {

    T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class TypeSafetyDemo {

    public static void main(String[] args) {

        Box<String> box1 = new Box<>();
        box1.setValue("Java");

        String language = box1.getValue();
        System.out.println("Language: " + language);

        Box<Integer> box2 = new Box<>();
        box2.setValue(100);

        Integer number = box2.getValue();
        System.out.println("Number: " + number);
    }
}