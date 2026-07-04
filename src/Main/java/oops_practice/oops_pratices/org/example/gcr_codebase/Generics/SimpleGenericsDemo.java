package Main.java.oops_practice.oops_pratices.org.example.gcr_codebase.Generics;

class DataHolder<T> {

    private T data;

    public DataHolder(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void display() {
        System.out.println("Data: " + data);
    }
}

public class SimpleGenericsDemo {

    public static void main(String[] args) {

        DataHolder<String> name = new DataHolder<>("Nitin");
        DataHolder<Integer> age = new DataHolder<>(20);

        name.display();
        age.display();

        System.out.println("Name: " + name.getData());
        System.out.println("Age: " + age.getData());
    }
}