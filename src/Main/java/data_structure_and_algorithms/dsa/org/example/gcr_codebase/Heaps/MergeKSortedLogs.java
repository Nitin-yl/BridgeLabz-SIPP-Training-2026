package Main.java.data_structure_and_algorithms.dsa.org.example.gcr_codebase.Heaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

class LogEntry {
    int timestamp;
    String message;

    public LogEntry(int timestamp, String message) {
        this.timestamp = timestamp;
        this.message = message;
    }

    @Override
    public String toString() {
        return "(" + timestamp + ", " + message + ")";
    }
}

public class MergeKSortedLogs {

    public List<LogEntry> mergeKSortedLogs(List<List<LogEntry>> sources) {

        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
                (a, b) -> Integer.compare(
                        sources.get(a[0]).get(a[1]).timestamp,
                        sources.get(b[0]).get(b[1]).timestamp)
        );

        for (int i = 0; i < sources.size(); i++) {
            if (!sources.get(i).isEmpty()) {
                minHeap.offer(new int[]{i, 0});
            }
        }

        List<LogEntry> merged = new ArrayList<>();

        while (!minHeap.isEmpty()) {

            int[] top = minHeap.poll();

            int sourceIndex = top[0];
            int elementIndex = top[1];

            merged.add(sources.get(sourceIndex).get(elementIndex));

            if (elementIndex + 1 < sources.get(sourceIndex).size()) {
                minHeap.offer(new int[]{sourceIndex, elementIndex + 1});
            }
        }

        return merged;
    }

    public static void main(String[] args) {

        List<LogEntry> server1 = Arrays.asList(
                new LogEntry(1, "Server1 Start"),
                new LogEntry(4, "Server1 Login"),
                new LogEntry(7, "Server1 Logout")
        );

        List<LogEntry> server2 = Arrays.asList(
                new LogEntry(2, "Server2 Start"),
                new LogEntry(5, "Server2 Error"),
                new LogEntry(8, "Server2 Restart")
        );

        List<LogEntry> server3 = Arrays.asList(
                new LogEntry(3, "Server3 Start"),
                new LogEntry(6, "Server3 Backup"),
                new LogEntry(9, "Server3 Shutdown")
        );

        List<List<LogEntry>> sources = Arrays.asList(server1, server2, server3);

        MergeKSortedLogs obj = new MergeKSortedLogs();

        List<LogEntry> mergedLogs = obj.mergeKSortedLogs(sources);

        System.out.println("Merged Log Timeline:");
        for (LogEntry log : mergedLogs) {
            System.out.println(log);
        }
    }
}