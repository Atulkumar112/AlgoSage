package com.cg.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Practice {
	static class Edge{
		int src;
		int nbr;
		int wt;
		Edge(int src, int nbr, int wt){
			this.src = src;
			this.nbr = nbr;
			this.wt=wt;
		}
	}
  
	public static void main(String[] args) throws Exception {
		System.out.println("enter all the values:- ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int vrtces = Integer.parseInt(br.readLine());  // V=7
		
		ArrayList<Edge>[] graph = new ArrayList[vrtces];
		for(int i=0; i<vrtces; i++) {
			graph[i] = new ArrayList<>();
		}
		
		int edges = Integer.parseInt(br.readLine());  // E=8
		for(int i=0; i<edges; i++) {
			String[] parts = br.readLine().split(" ");  // i used throws exception in line no. 
			//23 Because of line no. 36 
			int v1 = Integer.parseInt(parts[0]);
			int v2 = Integer.parseInt(parts[1]);
			int wt = Integer.parseInt(parts[2]);
			graph[v1].add(new Edge(v1, v2, wt));
			graph[v2].add(new Edge(v2, v1, wt));
		}
		
		
		
		int src = Integer.parseInt(br.readLine());
		int dest = Integer.parseInt(br.readLine());
		
		boolean[] visited = new boolean[vrtces];
		System.out.println(hasPath(graph, src, dest, visited));
				
  }
	
	public static boolean hasPath(ArrayList<Edge>[] graph, int src, int dest, boolean[] visited) {
		if(src == dest) {
			return true;
		}
		
		visited[src] = true;
		for(Edge edge: graph[src]) {
			if(visited[edge.nbr] == false) {
//				boolean hasNbrPath = hasPath(graph, edge.nbr, dest, visited);
//				if(hasNbrPath==true) {
//					return true;
//				}  // OR we can write like below in a single line.(converting 3 lines in a single line)
				
				return hasPath(graph, edge.nbr, dest, visited);
			}
		}
		return false;
	}
}



/* input is:---------
7
8
0 1 10
1 2 10
2 3 10
0 3 10
3 4 10
4 5 10
5 6 10
4 6 10
0
6

*/

// --------------------output
true
