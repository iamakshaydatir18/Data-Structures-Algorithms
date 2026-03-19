package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubSet {
	
public List<List<Integer>> subsetsWithDup(int[] nums) {
	List<List<Integer>> list = new ArrayList<>();
	List<Integer> arrayList = new ArrayList<>();
	Sequence(nums, 0,list, arrayList);
	return list;
    }

public List<List<Integer>> subsetsWithDupUsingPowerSet(int[] nums) {
	List<List<Integer>> list = new ArrayList<>();
	int n= nums.length;
	int targets = (int) Math.pow(2, n);
	
	for(int num =0;num<targets;num++) {
		
		List<Integer> arrayList = new ArrayList<>();
		for(int i=0;i<n;i++) {
			
			if((num &(1<<i)) != 0) {
				 arrayList.add(nums[i]);
			}
		}
		
		Collections.sort(arrayList);
		if(!list.contains(arrayList)) {
			list.add(arrayList);
		}
	}
	
	return list;
    }
	
public static void Sequence(int[] array, int i,List<List<Integer>> list, List<Integer> arrayList) {

	if (i == array.length) {
		
		List<Integer> temp = new ArrayList<>(arrayList);
		Collections.sort(temp);
				
		if (!list.contains(temp)) {
			list.add(temp);
		}
		return;
	}

		arrayList.add(array[i]);
		
		Sequence(array, i+1, list, arrayList);
		arrayList.remove(arrayList.size() - 1);

		Sequence(array, i+1, list, arrayList);

}
	public static void main(String[] args) {
		
		int[] array = {1,2,2};
		
		SubSet obj = new SubSet();
		//List<List<Integer>> list = obj.subsetsWithDup(array);

		List<List<Integer>> list = obj.subsetsWithDupUsingPowerSet(array);
		for(List a:list) {
			System.out.println(" "+a);
		}
		
	}

}
