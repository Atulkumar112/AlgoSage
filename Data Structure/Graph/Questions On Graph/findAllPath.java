//We have to find the all path from source to destination.
package com.cg.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Practice {
	static class Edge{
		int src;
		int nbr;
		int w;
		Edge(int src, int nbr, int w){
			this.src = src;
			this.nbr=nbr;
			this.w=w;
		}
		
	}
	
	public static void main(String[] args) throws Exception {
		System.out.println("Enter the all values: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int vrtxs = Integer.parseInt(br.readLine());
		
		ArrayList<Edge>[] graph = new ArrayList[vrtxs];
		for(int i=0; i<vrtxs; i++) {
			graph[i] = new ArrayList<>();
		}
		
		int edges = Integer.parseInt(br.readLine());
		for(int i=0; i<edges; i++) {
			String[] parts = br.readLine().split(" ");
			int v1 = Integer.parseInt(parts[0]);
			int v2 = Integer.parseInt(parts[1]);
			int w = Integer.parseInt(parts[2]);
			graph[v1].add(new Edge(v1, v2, w));
			graph[v2].add(new Edge(v2, v1,w));
			
		}
		int src = Integer.parseInt(br.readLine());
		int des = Integer.parseInt(br.readLine());
		
		boolean[] visited = new boolean[vrtxs];
		findPath(graph, src, des, visited, src+" ");
	}
	
	public static void findPath(ArrayList<Edge>[] graph, int src, int des, boolean[] visited, String str) {
		if(src==des) {
			System.out.println(str);
			return;
		}
		
		visited[src]=true;
//		str += src+" ";
		for(Edge edge: graph[src]) {
			if(visited[edge.nbr]==false) {
				findPath(graph, edge.nbr, des, visited, str+edge.nbr+" ");
				
			}
		}
		visited[src]=false;
	}
}




/* --------------------------------------------------input is:-----------------------------------
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

//------------------------------------------------ output--------------------
 
0 1 2 3 4 5 6 
0 1 2 3 4 6 
0 3 4 5 6 
0 3 4 6 
*/

