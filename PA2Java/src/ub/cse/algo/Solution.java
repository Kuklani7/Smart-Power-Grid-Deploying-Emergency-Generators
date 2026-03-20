package ub.cse.algo;

import java.util.*;

public class Solution {
	  private int startNode;
	  private HashMap<Integer, ArrayList<Integer>> graph;
	  public Solution(int node, HashMap<Integer, ArrayList<Integer>> g){
	    startNode = node;
	    graph = g;
	  }

	  public int[] outputDistances(){
		  HashMap<Integer,Integer> distance_tracker=new HashMap<>();
		  Set<Integer> visited=new HashSet<>();
		  Queue<Integer> mover=new LinkedList<>();
		  distance_tracker.put(startNode,0);
		  mover.add(startNode);
		  visited.add(startNode);
		  while(!mover.isEmpty()) {
			  int current = mover.remove();
			  ArrayList<Integer> iterator = graph.get(current);
			  for (int x : iterator) {
				  if (!visited.contains(x)) {
					  mover.add(x);
					  distance_tracker.put(x, distance_tracker.get(current) + 1);
					  visited.add(x);
				  }
			  }
		  }
		  int total_nodes=graph.keySet().size();
		  int [] array_nodes=new int [total_nodes];
		  for(int i=0;i<total_nodes;i++){
			  if(!distance_tracker.containsKey(i)){
				  array_nodes[i]=-1;
			  }
			  else{
				  array_nodes[i]=distance_tracker.get(i);
			  }
		  }
		  return array_nodes;
	  }
}
