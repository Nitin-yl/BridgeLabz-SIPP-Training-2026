package Main.java.oops_practice.oops_pratices.org.example.gcr_codebase.Generics;

import java.util.ArrayList;
import java.util.List;

public class RawTypeDemo {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Nitin");
        names.add("Rahul");
        names.add("Priya");

        System.out.println("Parameterized List:");

        for (String name : names) {
            System.out.println(name);
        }

        List rawList = new ArrayList();

        rawList.add("Java");
        rawList.add(100);
        rawList.add(45.6);

        System.out.println("\nRaw List:");

        for (Object obj : rawList) {
            System.out.println(obj);
        }
    }
}