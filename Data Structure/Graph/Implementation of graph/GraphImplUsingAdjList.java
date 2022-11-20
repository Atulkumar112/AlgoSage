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
			this.nbr = nbr;
			this.w=w;
		}
		
	}
  
	public static void main(String[] args) throws Exception {
		System.out.println("Enter the values:- ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int vrtces = Integer.parseInt(br.readLine());
		
		ArrayList<Edge>[] graph = new ArrayList[vrtces];
		for(int i=0; i<vrtces; i++) {
			graph[i] = new ArrayList<>();
		}
		
		int edges = Integer.parseInt(br.readLine());
		for(int i=0; i<edges; i++) {
			String[] parts = br.readLine().split(" ");  // i used throws exception in line no. 
			//23 becuase of line no. 36 
			int v1 = Integer.parseInt(parts[0]);
			int v2 = Integer.parseInt(parts[1]);
			int wt = Integer.parseInt(parts[2]);
			graph[v1].add(new Edge(v1, v2, wt));
			graph[v2].add(new Edge(v2, v1, wt));
		}
		
		for(int i=0; i<vrtces; i++) {
			System.out.println(graph[i]);
		}	
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
[0,1,10],[0,3,10]
[1,0,10],[1,2,10]
[2,1,10],[2,3,10]
[3,2,10],[3,0,10],[3,4,10]
[4,3,10],[4,5,10],[4,6,10]
[5,4,10],[5,6,10]
[6,5,10],[6,4,10]
*/


