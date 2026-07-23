package Main.java.data_structure_and_algorithms.dsa.org.example.gcr_codebase.Graphs;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FriendGraph {

    private Map<Integer, Set<Integer>> friendGraph = new HashMap<>();

    public void addFriendship(int u, int v) {

        friendGraph.computeIfAbsent(u, k -> new HashSet<>()).add(v);
        friendGraph.computeIfAbsent(v, k -> new HashSet<>()).add(u);
    }

    public boolean isFriend(int u, int v) {

        return friendGraph
                .getOrDefault(u, Collections.emptySet())
                .contains(v);
    }

    public void displayGraph() {

        System.out.println("Friend Graph:");

        for (Map.Entry<Integer, Set<Integer>> entry : friendGraph.entrySet()) {
            System.out.println("User " + entry.getKey() + " -> " + entry.getValue());
        }
    }

    public static void main(String[] args) {

        FriendGraph graph = new FriendGraph();

        graph.addFriendship(1, 2);
        graph.addFriendship(1, 3);
        graph.addFriendship(2, 4);
        graph.addFriendship(3, 5);
        graph.addFriendship(4, 5);

        graph.displayGraph();

        System.out.println();

        System.out.println("Is 1 friend with 2? " + graph.isFriend(1, 2));
        System.out.println("Is 1 friend with 5? " + graph.isFriend(1, 5));
        System.out.println("Is 4 friend with 5? " + graph.isFriend(4, 5));
    }
}