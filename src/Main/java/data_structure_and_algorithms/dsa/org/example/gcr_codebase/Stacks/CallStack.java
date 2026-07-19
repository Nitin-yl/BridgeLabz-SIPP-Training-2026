package Main.java.data_structure_and_algorithms.dsa.org.example.gcr_codebase.Stacks;

public class CallStack {

    static class Frame {
        String functionName;
        Frame next;

        Frame(String name, Frame next) {
            functionName = name;
            this.next = next;
        }
    }

    private Frame top = null;

    void push(String functionName) {
        top = new Frame(functionName, top);
    }

    String pop() {

        if (top == null)
            throw new RuntimeException("Stack Empty");

        String name = top.functionName;
        top = top.next;
        return name;
    }

    String peek() {

        if (top == null)
            throw new RuntimeException("Stack Empty");

        return top.functionName;
    }

    boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {

        CallStack stack = new CallStack();

        stack.push("main()");
        stack.push("login()");
        stack.push("validate()");

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}