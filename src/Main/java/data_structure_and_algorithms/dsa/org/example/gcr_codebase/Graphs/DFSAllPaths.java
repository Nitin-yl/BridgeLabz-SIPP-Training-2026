package Main.java.data_structure_and_algorithms.dsa.org.example.gcr_codebase.Graphs;

import java.util.*;

public class DFSAllPaths {

    static Map<Integer, List<Integer>> graph = new HashMap<>();

    static void addEdge(int u,int v){
        graph.computeIfAbsent(u,k->new ArrayList<>()).add(v);
        graph.computeIfAbsent(v,k->new ArrayList<>()).add(u);
    }

    static void allRoutes(int current,
                          int target,
                          List<Integer> path,
                          Set<Integer> visited,
                          List<List<Integer>> result){

        path.add(current);
        visited.add(current);

        if(current==target){
            result.add(new ArrayList<>(path));
        }else{

            for(int next:graph.getOrDefault(current,Collections.emptyList())){

                if(!visited.contains(next)){
                    allRoutes(next,target,path,visited,result);
                }
            }
        }

        path.remove(path.size()-1);
        visited.remove(current);
    }

    public static void main(String[] args){

        addEdge(0,1);
        addEdge(0,2);
        addEdge(1,3);
        addEdge(2,3);
        addEdge(3,4);

        List<List<Integer>> routes=new ArrayList<>();

        allRoutes(0,4,new ArrayList<>(),new HashSet<>(),routes);

        System.out.println("All Routes:");

        for(List<Integer> path:routes){
            System.out.println(path);
        }
    }
}