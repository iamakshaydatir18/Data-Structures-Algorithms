package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CombinationSum {

	public static List<List<Integer>> combinationSum2(int[] candidates, int target) {

		List<List<Integer>> ans = new ArrayList<>();
		Arrays.sort(candidates);
		Sum(candidates, 0, target, ans, new ArrayList<Integer>());
		return ans;
	}

	public static void Sum(int[] arr, int ind, int target, List<List<Integer>> ans, List<Integer> ds) {

	
			if (target == 0) {
				ans.add(new ArrayList<>(ds));
				return;
			}
		
			for(int i = ind;i<arr.length;i++) {
				
				if(i>ind && arr[i] == arr[i-1]) continue;
				
				if(arr[i] > target) break;
				
				ds.add(arr[i]);
				Sum(arr, i + 1, target - arr[i] , ans, ds);
				ds.remove(ds.size()-1);
			}
		
	}

	public static void main(String[] args) {
		
		int[] array = {10,1,2,7,6,1,5};
		 
		 List<List<Integer>> list = combinationSum2(array,8);;
		  System.out.println(" Array length "+array.length);
		 for(List l:list) {
		 
		 System.out.println(" "+l); }
	}

}
