package Main.java.oops_practice.oops_pratices.org.example.gcr_codebase.Generics;

class Storage<T> {

    private T data;

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}

class User {

    private Storage<String> storage = new Storage<>();

    public void saveName(String name) {
        storage.setData(name);
    }

    public void displayName() {
        System.out.println("User Name: " + storage.getData());
    }
}

public class CompositionDemo {

    public static void main(String[] args) {

        User user = new User();

        user.saveName("Nitin");

        user.displayName();
    }
}