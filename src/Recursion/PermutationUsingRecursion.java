package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PermutationUsingRecursion {

	public String getPermutation(int n, int k) {

		List<List<Integer>> list = new ArrayList<>();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = i + 1;
		}

		boolean[] visited = new boolean[n];

		//solveBruteForce(array, visited, new ArrayList<>(), list);
		
		SolveOptimal(0, array, list);
		
		System.out.println("List is - ");
		for(List a:list) {
			System.out.println(" "+a);
		}
		
		List<Integer> ans = list.get(k);

		String ret = "";

		for (Integer a : ans) {
			ret += a;
		}
		return ret;
	}

	private void solveBruteForce(int[] array, boolean[] visited, ArrayList<Integer> arrayList,
			List<List<Integer>> list) {

		if (arrayList.size() == array.length) {
			list.add(new ArrayList<Integer>(arrayList));
			

		}

		for (int i = 0; i < array.length; i++) {

			if (!visited[i]) {
				visited[i] = true;
				arrayList.add(array[i]);
				solveBruteForce(array, visited, arrayList, list);
				arrayList.remove(arrayList.size() - 1);
				visited[i] = false;
			}
		}
	}
	
	private void SolveOptimal(int indx,int[] array,List<List<Integer>> list) {
		
		if(indx == array.length) {
			
			List<Integer> arr = new ArrayList<>();
			for(int a:array) {
				arr.add(a);
			}
			list.add(new ArrayList<>(arr));
			return;
		}
		
		for(int i = indx; i<array.length;i++) {
			swap(indx,i,array);
			SolveOptimal(indx+1, array, list);
			
			swap(indx,i,array);
		}
	}
	private void swap(int indx, int i, int[] array) {
		
		int temp = array[indx];
		array[indx]= array[i];
		array[i] = temp;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(" " + new PermutationUsingRecursion().getPermutation(3, 3));
		
		//optimised
		System.err.println("3rd postion is - "+ OptimalStringPermutation(3,3));
		
		//System.out.println("Using 01 beats- "+usingBeats(3,3));
	}


	private static String OptimalStringPermutation(int n, int k) {
		
		int fact = 1;
		ArrayList<Integer> list = new ArrayList<>();
		for(int i =1;i<n;i++) {
			
			fact = fact *i;
			list.add(i);
		}
		list.add(n);
		String ans="";
		k=k-1;
		while(true) {
			
			ans = ans+ list.get(k/fact);
			list.remove(k/fact);
			
			if(list.size() == 0) break;
			
			k = k%fact;
			fact = fact/list.size();
		}
		return ans;
	}

}
