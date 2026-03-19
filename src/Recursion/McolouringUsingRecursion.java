package Recursion;
import java.util.*;
import java.lang.*;
import java.io.*;

public class McolouringUsingRecursion {
	
	
	public static boolean graphColoring(boolean graph[][], int m, int n) {
		
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			list.add(new ArrayList<Integer>());
		}
		
		for(int i=0;i<graph.length;i++) {
			for(int j=0;j<graph.length;j++) {
				
				if(i==j) continue; 
				
				if(graph[i][j] ==  true) {
					list.get(i).add(j);
				}
			}
		}
		
		
		
		
		  System.out.println(" matrix to ArrayList Conversion is - "); for(int
		  i=0;i<graph.length;i++) { System.out.print(" List of "+i); for(int
		  j=0;j<list.get(i).size();j++) { System.out.print(" "+list.get(i).get(j)); }
		  System.out.println(); }
		 
		
		  int[] col = new int[n]; for(int i =0;i<col.length;i++) { col[i] = 0; }
		 
		/* ArrayList<Integer> col = new ArrayList<>(); */
		return Solve(0,list,col,m,n);
  
    }


	private static boolean Solve(int ind,ArrayList<ArrayList<Integer>> list,int[] col, int m, int n) {
		
		if(ind == n) return true;
		
		for(int i=1;i<=m;i++) {
			
			if(safe(ind,list,col,m,i)) {
				col[ind]=i;
				
				if(Solve(ind+1,list,col,m,n) == true) return true;
				else col[ind] = 0;
					
			}
		}
		
		return false;
		
	}


	private static boolean safe(int ind, ArrayList<ArrayList<Integer>> list,int[] col, int m,int currCol) {
		for(int a:list.get(ind)) {
			if(col[a] == currCol) return false;
		}
		return true;
	}


	public static void main(String[] args) {

		        Scanner scan = new Scanner(System.in);
		      //  int tc = scan.nextInt();

		            int N = scan.nextInt();
		            int M = scan.nextInt();
		            int E = scan.nextInt();

		            boolean graph[][] = new boolean[N][N];

		            for (int i = 0; i < E; i++) {
		                int u = scan.nextInt()-1;
		                int v = scan.nextInt()-1;
		                graph[u][v] = true;
		                graph[v][u] = true;
		            }
		            
		            System.out.println(" Boolean Array is- ");
		            for(int i=0;i<N; i++) {
		            	System.out.println();
		            	for(int j=0;j<N; j++) {
		            		System.out.print(" "+graph[i][j]);
		            	}
		            }
		            System.out.println();
		            System.out.println(graphColoring(graph, M, N) ? 1 : 0);
		        
	}	

}
