package Main.java.oops_practice.oops_pratices.org.example.gcr_codebase.Generics;

class Student {

    int marks;

    public Student(int marks) {
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }
}

class Result<T extends Student> {

    T student;

    public Result(T student) {
        this.student = student;
    }

    public void displayResult() {
        System.out.println("Marks: " + student.getMarks());
    }
}

public class BoundedTypeParameterDemo {

    public static void main(String[] args) {

        Student student = new Student(95);

        Result<Student> result = new Result<>(student);

        result.displayResult();
    }
}