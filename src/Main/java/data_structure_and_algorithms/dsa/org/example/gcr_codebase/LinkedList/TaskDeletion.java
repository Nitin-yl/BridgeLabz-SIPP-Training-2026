package Main.java.data_structure_and_algorithms.dsa.org.example.gcr_codebase.LinkedList;

public class TaskDeletion {

    static class Node {
        int id;
        Node next;

        Node(int id) {
            this.id = id;
        }
    }

    static Node removeTask(Node head, int taskId) {

        if (head == null)
            return null;

        if (head.id == taskId)
            return head.next;

        Node prev = head;
        Node curr = head.next;

        while (curr != null && curr.id != taskId) {
            prev = curr;
            curr = curr.next;
        }

        if (curr != null)
            prev.next = curr.next;

        return head;
    }

    static void display(Node head) {
        while (head != null) {
            System.out.print(head.id + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        head = removeTask(head, 3);

        display(head);
    }
}