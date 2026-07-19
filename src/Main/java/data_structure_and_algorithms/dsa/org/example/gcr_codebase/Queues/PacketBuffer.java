package Main.java.data_structure_and_algorithms.dsa.org.example.gcr_codebase.Queues ;

public class PacketBuffer {

    private int[] data;
    private int front;
    private int count;

    PacketBuffer(int capacity) {
        data = new int[capacity];
        front = 0;
        count = 0;
    }

    boolean enqueue(int packetId) {

        if (count == data.length) {
            System.out.println("Buffer Full");
            return false;
        }

        data[(front + count) % data.length] = packetId;
        count++;
        return true;
    }

    int dequeue() {

        if (count == 0)
            throw new RuntimeException("Buffer Empty");

        int value = data[front];
        front = (front + 1) % data.length;
        count--;

        return value;
    }

    public static void main(String[] args) {

        PacketBuffer queue = new PacketBuffer(5);

        queue.enqueue(101);
        queue.enqueue(102);
        queue.enqueue(103);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        queue.enqueue(104);
        queue.enqueue(105);
        queue.enqueue(106);

        System.out.println(queue.dequeue());
    }
}