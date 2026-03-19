package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationsUsingRecursion {
	
	private static List<List<Integer>> Permuations(int[] array) {
		
		List<List<Integer>> list = new ArrayList<>();
		boolean[] boolaray = new boolean[array.length];
		operation(array,boolaray,list,new ArrayList<>());
		return list;
	}

	private static void operation(int[] array, boolean[] boolaray, List<List<Integer>> list, ArrayList arrayList) {

		if(arrayList.size() == array.length) {
			list.add(new ArrayList<>(arrayList));
		}
		
		for(int i=0;i<array.length;i++) {
			
			if(!boolaray[i]) {
				boolaray[i] = true;
				arrayList.add(array[i]);
				operation(array, boolaray, list, arrayList);
				arrayList.remove(arrayList.size()-1);
				boolaray[i]= false;
			}
		}
		
	}
	
	
private static List<List<Integer>> PermuationsOptimal(int[] array) {
		
		List<List<Integer>> list = new ArrayList<>();
		operationOptimal(0,array,list);
		return list;
	}

	private static void operationOptimal(int indx, int[] array, List<List<Integer>> list) {
	
		if(indx == array.length) {
			
			List<Integer> arrayList = new ArrayList<>();
			
			for(int a:array) {
				arrayList.add(a);
			}
			
			if(!list.contains(arrayList))list.add(new ArrayList<>(arrayList));
			return;
		}
		
		
		for(int i=indx; i<array.length;i++) {
			swap(i,indx,array);
			operationOptimal(indx+1, array, list);
			swap(i,indx,array);
		}
		
		
}

	private static void swap(int i, int indx, int[] array) {
		int t = array[i];
		array[i] = array[indx];
		array[indx] = t;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1,2,3};
		
		//1st Approach
		List<List<Integer>> ans = Permuations(array);
		
		
		//2nd more optimal approach
		//List<List<Integer>> ans = PermuationsOptimal(array);
		for(List a:ans) {
			System.out.println(" "+ a);
		}
	}


}
