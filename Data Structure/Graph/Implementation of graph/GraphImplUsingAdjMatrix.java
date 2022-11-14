package com.cg.java;

public class Practice {
	// below side we can write private or static that depends on you, 
	// but private is better because you have not created static nested class if you created nested static class then you 
	// write static 
	
	  private int E;
	  private int V;
	  static int[][] adjMatrix;   
	  Practice(int node){
		  this.E = 0;
		  this.V = node;
		  this.adjMatrix = new int[node][node];
	  }
	  
	  public void edge(int u, int v) {
		  adjMatrix[u][v] = 1;
		  adjMatrix[v][u] = 1;
		  E++;
	  }
	  
	  public String toString() {
		  StringBuilder sb = new StringBuilder();
		  sb.append("Edge = "+E+" Vertices = "+V+"\n");
		  for(int v=0; v<V; v++) {
			  sb.append(v+": ");
			  for(int w: adjMatrix[v] ) {
				  sb.append(w+" ");
			  }
			  sb.append("\n");
		  }
		  return sb.toString();
	  }
  
	public static void main(String[] args) {
		Practice g = new Practice(4);    // node or vertices = 4
		g.edge(0, 1);
		g.edge(1, 2);
		g.edge(2, 3);
		g.edge(3, 0);
		System.out.println(g);
  }
}

// Output.....
/*
Edge = 4 Vertices = 4
0: 0 1 0 1 
1: 1 0 1 0 
2: 0 1 0 1 
3: 1 0 1 0 


// below is a graph based on a code input
0 --------- 1
|           |
|			      |
|           |				
|		        |				
3 ----------2


*/
