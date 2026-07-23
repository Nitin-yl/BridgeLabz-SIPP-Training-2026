package Main.java.data_structure_and_algorithms.dsa.org.example.gcr_codebase.Graphs;

import java.util.*;

public class UndirectedCycleDetection {

    static Map<Integer,List<Integer>> graph=new HashMap<>();

    static void addEdge(int u,int v){

        graph.computeIfAbsent(u,k->new ArrayList<>()).add(v);
        graph.computeIfAbsent(v,k->new ArrayList<>()).add(u);
    }

    static boolean dfs(int node,int parent,Set<Integer> visited){

        visited.add(node);

        for(int next:graph.getOrDefault(node,Collections.emptyList())){

            if(!visited.contains(next)){

                if(dfs(next,node,visited))
                    return true;

            }else if(next!=parent){

                return true;
            }
        }

        return false;
    }

    static boolean hasCycle(int n){

        Set<Integer> visited=new HashSet<>();

        for(int i=0;i<n;i++){

            if(!visited.contains(i)){

                if(dfs(i,-1,visited))
                    return true;
            }
        }

        return false;
    }

    public static void main(String[] args){

        addEdge(0,1);
        addEdge(1,2);
        addEdge(2,0);

        System.out.println("Cycle Present = "+hasCycle(3));
    }
}