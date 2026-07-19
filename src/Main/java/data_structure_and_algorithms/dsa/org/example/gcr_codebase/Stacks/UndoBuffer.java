package Main.java.data_structure_and_algorithms.dsa.org.example.gcr_codebase.Stacks;

public class UndoBuffer {

    private String[] data;
    private int top;

    UndoBuffer(int maxDepth) {
        data = new String[maxDepth];
        top = -1;
    }

    boolean push(String edit) {
        if (top == data.length - 1) {
            System.out.println("Undo Buffer Full");
            return false;
        }

        data[++top] = edit;
        return true;
    }

    String pop() {
        if (isEmpty())
            throw new RuntimeException("Nothing to Undo");

        return data[top--];
    }

    String peek() {
        if (isEmpty())
            throw new RuntimeException("Buffer Empty");

        return data[top];
    }

    boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {

        UndoBuffer stack = new UndoBuffer(5);

        stack.push("Edit1");
        stack.push("Edit2");
        stack.push("Edit3");

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}