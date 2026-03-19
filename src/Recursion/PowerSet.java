package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {2,3};
		
		List<List<Integer>> list = new ArrayList<>();
		
		  Solution(array, list); for(List a:list){ System.out.println(" "+a); }
		 
		
		/*
		 * SolustionUsingRecursion(0,array,list,new ArrayList<Integer>()); for(List
		 * a:list){ System.out.println(" "+a); }
		 */
		
	}

	private static void SolustionUsingRecursion(int i, int[] array, List<List<Integer>> list,
			ArrayList<Integer> arrayList) {
		// TODO Auto-generated method stub
		
		if( i == array.length) {
			list.add(new ArrayList<>(arrayList));
			return;
		}
		
		arrayList.add(array[i]);
		
		SolustionUsingRecursion(i+1, array, list, arrayList);
		
		arrayList.remove(arrayList.size()-1);
		
		SolustionUsingRecursion(i+1, array, list, arrayList);
		
	}

	private static void Solution(int[] array, List<List<Integer>> list) {
		
		int n= array.length;
		int targets = (int) Math.pow(2, n);
		System.out.println("Trgets-" + targets);
		for(int num=0;num<targets;num++) {
			
			List<Integer> arr = new ArrayList<>();
			
			for(int i=0;i<n;i++){
				
				if((num & (1<<i)) !=0) {
					arr.add(array[i]);
				}
			}
			
			list.add(arr);
			/*
			 * if(arr.size() > 0) { list.add(arr); }
			 */
		}
		
	}

	

}
