package Main.java.data_structure_and_algorithms.dsa.org.example.gcr_codebase.Graphs;

import java.util.*;

public class ConnectedComponents {

    static Map<Integer,List<Integer>> graph=new HashMap<>();

    static void addEdge(int u,int v){
        graph.computeIfAbsent(u,k->new ArrayList<>()).add(v);
        graph.computeIfAbsent(v,k->new ArrayList<>()).add(u);
    }

    static void dfs(int node,Set<Integer> visited){

        visited.add(node);

        for(int next:graph.getOrDefault(node,Collections.emptyList())){

            if(!visited.contains(next)){
                dfs(next,visited);
            }
        }
    }

    static int countComponents(int n){

        Set<Integer> visited=new HashSet<>();

        int components=0;

        for(int i=0;i<n;i++){

            if(!visited.contains(i)){
                components++;
                dfs(i,visited);
            }
        }

        return components;
    }

    public static void main(String[] args){

        addEdge(0,1);
        addEdge(1,2);
        addEdge(3,4);

        int n=6;

        int components=countComponents(n);

        System.out.println("Connected Components = "+components);

        if(components==1)
            System.out.println("Network is Fully Connected");
        else
            System.out.println("Network is NOT Fully Connected");
    }
}