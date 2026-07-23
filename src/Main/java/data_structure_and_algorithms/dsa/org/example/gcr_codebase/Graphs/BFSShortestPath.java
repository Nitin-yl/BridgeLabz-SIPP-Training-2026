package Main.java.data_structure_and_algorithms.dsa.org.example.gcr_codebase.Graphs;

import java.util.*;

public class BFSShortestPath {

    static Map<Integer, List<Integer>> graph = new HashMap<>();

    static void addEdge(int u, int v) {
        graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
        graph.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
    }

    static List<Integer> fewestFlights(int src, int dest) {

        Queue<Integer> queue = new LinkedList<>();
        Map<Integer, Integer> parent = new HashMap<>();
        Set<Integer> visited = new HashSet<>();

        queue.offer(src);
        visited.add(src);
        parent.put(src, null);

        while (!queue.isEmpty()) {

            int city = queue.poll();

            if (city == dest)
                break;

            for (int next : graph.getOrDefault(city, Collections.emptyList())) {

                if (!visited.contains(next)) {
                    visited.add(next);
                    parent.put(next, city);
                    queue.offer(next);
                }
            }
        }

        if (!visited.contains(dest))
            return Collections.emptyList();

        LinkedList<Integer> path = new LinkedList<>();

        Integer node = dest;

        while (node != null) {
            path.addFirst(node);
            node = parent.get(node);
        }

        return path;
    }

    public static void main(String[] args) {

        addEdge(0,1);
        addEdge(0,2);
        addEdge(1,3);
        addEdge(2,4);
        addEdge(3,5);
        addEdge(4,5);

        System.out.println("Shortest Path:");
        System.out.println(fewestFlights(0,5));
    }
}