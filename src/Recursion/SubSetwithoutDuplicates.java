package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSetwithoutDuplicates {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
    Arrays.sort(nums);
	List<List<Integer>> list = new ArrayList<>();
    Sequence(0,nums,list,new ArrayList<>());
	return list;
    }

    public void Sequence(int ind, int[] array,List<List<Integer>> list, List<Integer> ds){

         list.add(new ArrayList<>(ds));

         for(int i=ind;i<array.length;i++){

            if(i!=ind && array[i] == array[i-1]) continue;

            ds.add(array[i]);
            Sequence(i+1,array,list,ds);
            ds.remove(ds.size()-1);
         }
    }
}