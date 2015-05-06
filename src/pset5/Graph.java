package pset5;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map;
import java.util.Set;

public class Graph {
    private Set<Integer> nodes; // set of nodes in the graph
    private Map<Integer, TreeSet<Integer>> edges;
    // map between a node and a set of nodes that are connected to it by outgoing edges
    // class invariant: fields "nodes" and "edges" are non-null;
    //                  "this" graph has no node that is not in "nodes"
    public Graph() {
        nodes = new TreeSet<Integer>();
        edges = new TreeMap<Integer, TreeSet<Integer>>() ;
}
    public String toString() {
        return "nodes: " + nodes + "\n" + "edges: " + edges;
}
    public void addNode(int n) {
        // postcondition: adds the node "n" to this graph
        nodes.add(n);
}
    public void addEdge(int from, int to) {
        // postcondition: adds a directed edge "from" -> "to" to this graph
        // your code goes here

       if(!nodes.contains(from)){
    	   nodes.add(from) ;
       }
       if(!nodes.contains(to)){
    	   nodes.add(to) ;
       }
       if(edges.get(from) == null){
    	   edges.put(from, new TreeSet<Integer>()) ;
    	   edges.get(from).add(to) ;
       }else{
    	   edges.get(from).add(to) ;
       }
}
    public boolean reachable(Set<Integer> sources, Set<Integer> targets) {
        if (sources == null || targets == null) throw new IllegalArgumentException();
        // postcondition: returns true if (1) "sources" is a subset of "nodes", (2) "targets" is
        //                           a subset of "nodes", and (3) for each node "m" in set "targets",
        //                           there is some node "n" in set "sources" such that there is a
        //                           directed path that starts at "n" and ends at "m" in "this"; and
        //                           false otherwise
        // your code goes here
       // ...
        for (int i: sources){
        	if(!nodes.contains(i)) return false;
        }
        for (int i:targets){
        	if(!nodes.contains(i)) return false;
        }
        for (int i:targets){
        	for (int j:sources){
        		if(!reachable(i, j, new ArrayList<Integer>())){
        			return false;
        		}
        	}
        }
        return true; 
    }
    private boolean reachable(int source, int target, ArrayList<Integer> list){
    	if(source == target) return true;
    	Set<Integer> s = edges.get(source);
    	list.add(source);
    	if (s == null) return false;
    	for(int i:s){
    		if(!list.contains(i) && reachable(i, target, list)){
    			return true;
    		}
    	}
    	return false;
    }
}