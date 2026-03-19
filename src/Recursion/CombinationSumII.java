package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumII {
	public List<List<Integer>> combinationSum3(int k, int n) {
		List<List<Integer>> ans = new ArrayList<>();
		if (n < k)
			return ans;

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = i + 1;
		}

		Sum(0, arr, n,k, ans, new ArrayList<>());

		
		return ans;
	}

	public void Sum(int ind, int[] arr, int n,int k, List<List<Integer>> ans, List<Integer> ds) {

		if (n == 0) {
			if(ds.size() == k ) {
				ans.add(new ArrayList<>(ds));
			}
			return;
		}

		for (int i = ind; i < arr.length; i++) {

			if (i > ind && arr[i] == arr[i - 1])
				continue;

			if (arr[i] > n)
				break;

			ds.add(arr[i]);
			Sum(i + 1, arr, n - arr[i],k, ans, ds);
			ds.remove(ds.size() - 1);
		}
	}

	public static void main(String[] args) {
		
		CombinationSumII obj = new CombinationSumII();
		
		List<List<Integer>> list = obj.combinationSum3(3,7);
			
		for(List a:list) {
			System.out.println(" "+a);
		}
	}

}
