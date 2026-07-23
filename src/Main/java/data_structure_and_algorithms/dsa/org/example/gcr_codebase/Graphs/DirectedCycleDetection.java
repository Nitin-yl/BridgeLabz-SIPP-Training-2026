package Main.java.data_structure_and_algorithms.dsa.org.example.gcr_codebase.Graphs;

import java.util.*;

public class DirectedCycleDetection {

    static Map<Integer,List<Integer>> graph=new HashMap<>();

    static void addEdge(int u,int v){
        graph.computeIfAbsent(u,k->new ArrayList<>()).add(v);
    }

    static boolean dfs(int node,int[] state){

        state[node]=1;

        for(int next:graph.getOrDefault(node,Collections.emptyList())){

            if(state[next]==1)
                return true;

            if(state[next]==0 && dfs(next,state))
                return true;
        }

        state[node]=2;

        return false;
    }

    static boolean hasCycle(int n){

        int[] state=new int[n];

        for(int i=0;i<n;i++){

            if(state[i]==0){

                if(dfs(i,state))
                    return true;
            }
        }

        return false;
    }

    public static void main(String[] args){

        addEdge(0,1);
        addEdge(1,2);
        addEdge(2,3);
        addEdge(3,1);

        System.out.println("Cycle Present = "+hasCycle(4));
    }
}