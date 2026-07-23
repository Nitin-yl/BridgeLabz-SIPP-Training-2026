package Main.java.data_structure_and_algorithms.dsa.org.example.story_based_codebase;
import java.util.*;

public class CityGraph {

    private int V;
    private List<List<Integer>> adj;

    public CityGraph(int V) {
        this.V = V;
        adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v) {
        adj.get(u).add(v);
    }

    public void addUndirectedEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public void bfsShortestPath(int src, int dest) {

        boolean[] visited = new boolean[V];
        int[] parent = new int[V];
        Arrays.fill(parent, -1);

        Queue<Integer> queue = new LinkedList<>();

        visited[src] = true;
        queue.offer(src);

        while (!queue.isEmpty()) {

            int node = queue.poll();

            if (node == dest)
                break;

            for (int neighbor : adj.get(node)) {

                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    parent[neighbor] = node;
                    queue.offer(neighbor);
                }
            }
        }

        if (!visited[dest]) {
            System.out.println("No path exists.");
            return;
        }

        List<Integer> path = new ArrayList<>();

        for (int at = dest; at != -1; at = parent[at]) {
            path.add(at);
        }

        Collections.reverse(path);

        System.out.println("Shortest Path (BFS): " + path);
    }

    public void printAllPaths(int src, int dest) {

        boolean[] visited = new boolean[V];
        List<Integer> path = new ArrayList<>();

        System.out.println("All Paths:");
        dfsAllPaths(src, dest, visited, path);
    }

    private void dfsAllPaths(int current, int dest,
                             boolean[] visited,
                             List<Integer> path) {

        visited[current] = true;
        path.add(current);

        if (current == dest) {
            System.out.println(path);
        } else {

            for (int neighbor : adj.get(current)) {
                if (!visited[neighbor]) {
                    dfsAllPaths(neighbor, dest, visited, path);
                }
            }
        }

        path.remove(path.size() - 1);
        visited[current] = false;
    }

    public void connectedComponents() {

        boolean[] visited = new boolean[V];

        int count = 0;

        for (int i = 0; i < V; i++) {

            if (!visited[i]) {

                count++;
                System.out.print("Component " + count + ": ");

                dfsComponent(i, visited);

                System.out.println();
            }
        }
    }

    private void dfsComponent(int node, boolean[] visited) {

        visited[node] = true;

        System.out.print(node + " ");

        for (int neighbor : adj.get(node)) {

            if (!visited[neighbor]) {
                dfsComponent(neighbor, visited);
            }
        }
    }

    public boolean hasCycle() {

        boolean[] visited = new boolean[V];
        boolean[] recStack = new boolean[V];

        for (int i = 0; i < V; i++) {

            if (detectCycle(i, visited, recStack))
                return true;
        }

        return false;
    }

    private boolean detectCycle(int node,
                                boolean[] visited,
                                boolean[] recStack) {

        if (recStack[node])
            return true;

        if (visited[node])
            return false;

        visited[node] = true;
        recStack[node] = true;

        for (int neighbor : adj.get(node)) {

            if (detectCycle(neighbor, visited, recStack))
                return true;
        }

        recStack[node] = false;

        return false;
    }

    public static void main(String[] args) {

        CityGraph graph = new CityGraph(10);

        graph.addUndirectedEdge(0, 1);
        graph.addUndirectedEdge(0, 2);
        graph.addUndirectedEdge(1, 3);
        graph.addUndirectedEdge(2, 3);
        graph.addUndirectedEdge(3, 4);
        graph.addUndirectedEdge(4, 5);
        graph.addUndirectedEdge(5, 6);
        graph.addUndirectedEdge(7, 8);

        System.out.println("===== BFS Shortest Path =====");
        graph.bfsShortestPath(0, 6);

        System.out.println("\n===== DFS All Paths =====");
        graph.printAllPaths(0, 6);

        System.out.println("\n===== Connected Components =====");
        graph.connectedComponents();

        CityGraph directed = new CityGraph(4);

        directed.addEdge(0, 1);
        directed.addEdge(1, 2);
        directed.addEdge(2, 3);
        directed.addEdge(3, 1); // Creates a cycle

        System.out.println("\n===== Cycle Detection =====");
        if (directed.hasCycle()) {
            System.out.println("Cycle Detected");
        } else {
            System.out.println("No Cycle");
        }
    }
}