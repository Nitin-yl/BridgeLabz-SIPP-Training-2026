package Main.java.data_structure_and_algorithms.dsa.org.example.story_based_codebase;

public class TrainManagementSystem {

    static class Node {
        int coachNo;
        Node next;

        Node(int coachNo) {
            this.coachNo = coachNo;
        }
    }

    // Insert Coach at End
    static Node addCoach(Node head, int coachNo) {

        Node newNode = new Node(coachNo);

        if (head == null)
            return newNode;

        Node temp = head;

        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;

        return head;
    }

    // Remove Coach
    static Node removeCoach(Node head, int coachNo) {

        if (head == null)
            return null;

        if (head.coachNo == coachNo)
            return head.next;

        Node prev = head;
        Node curr = head.next;

        while (curr != null && curr.coachNo != coachNo) {
            prev = curr;
            curr = curr.next;
        }

        if (curr != null)
            prev.next = curr.next;

        return head;
    }

    // Reverse Train
    static Node reverseTrain(Node head) {

        Node prev = null;
        Node curr = head;

        while (curr != null) {

            Node next = curr.next;

            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    // Detect Circular Route (Cycle Detection)
    static boolean hasCycle(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                return true;
        }

        return false;
    }

    // Find Middle Coach
    static Node middleCoach(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Merge Two Sorted Train Schedules
    static Node mergeSchedules(Node a, Node b) {

        Node dummy = new Node(0);
        Node tail = dummy;

        while (a != null && b != null) {

            if (a.coachNo <= b.coachNo) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }

            tail = tail.next;
        }

        if (a != null)
            tail.next = a;
        else
            tail.next = b;

        return dummy.next;
    }

    // Display Linked List
    static void display(Node head) {

        while (head != null) {
            System.out.print(head.coachNo + " ");
            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Node train = null;

        train = addCoach(train, 10);
        train = addCoach(train, 20);
        train = addCoach(train, 30);
        train = addCoach(train, 40);

        System.out.println("Train Coaches:");
        display(train);

        train = removeCoach(train, 20);

        System.out.println("After Removing Coach 20:");
        display(train);

        train = reverseTrain(train);

        System.out.println("After Reversing Train:");
        display(train);

        Node middle = middleCoach(train);
        System.out.println("Middle Coach: " + middle.coachNo);

        System.out.println("Cycle Present: " + hasCycle(train));

        // Merge Two Sorted Schedules
        Node schedule1 = new Node(1);
        schedule1.next = new Node(3);
        schedule1.next.next = new Node(5);

        Node schedule2 = new Node(2);
        schedule2.next = new Node(4);
        schedule2.next.next = new Node(6);

        Node merged = mergeSchedules(schedule1, schedule2);

        System.out.println("Merged Train Schedule:");
        display(merged);
    }
}