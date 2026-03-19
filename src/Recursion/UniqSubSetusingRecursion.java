package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UniqSubSetusingRecursion {
	
	public static List<List<Integer>> function(int[] array){
		
		List<List<Integer>> list = new ArrayList<>();
		Sequence(array,0,list,new ArrayList<Integer>());
		
		return list;
	}
	
	
	public static void Sequence(int[] array, int ind,List<List<Integer>> list, List<Integer> arrayList) {

		list.add(new ArrayList<>(arrayList));
		
		for(int i=ind;i<array.length;i++) {
			
			if(i!=ind && array[i] == array[i-1]) continue;
			
			arrayList.add(array[i]);
		  	Sequence(array, i+1, list, arrayList);
		  	arrayList.remove(arrayList.size()-1);
			
		}

	}
		public static void main(String[] args) {
			
			int[] array = {1,2,2};
			
			
			List<List<Integer>> ans = function(array);
			for(List a:ans) {
				System.out.println(" "+a);
			}
			
		}

}
