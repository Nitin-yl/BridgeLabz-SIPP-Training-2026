package Main.java.data_structure_and_algorithms.dsa.org.example.gcr_codebase.LinkedList;

public class PlaylistInsertion {

    static class Node {
        int trackId;
        Node next;

        Node(int trackId) {
            this.trackId = trackId;
        }
    }

    static void insertAfter(Node current, int trackId) {
        if (current == null) return;

        Node newNode = new Node(trackId);
        newNode.next = current.next;
        current.next = newNode;
    }

    static void display(Node head) {
        while (head != null) {
            System.out.print(head.trackId + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(101);
        head.next = new Node(102);
        head.next.next = new Node(104);

        insertAfter(head.next, 103);

        display(head);
    }
}