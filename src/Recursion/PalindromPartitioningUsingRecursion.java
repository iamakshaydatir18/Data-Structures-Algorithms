package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PalindromPartitioningUsingRecursion {

	public List<List<String>> partition(String s) {
		
		List<List<String>> list = new ArrayList<>();
		
		partitionseq(0, s, list, new ArrayList<>());
		
		return list;

	}
	
	public void partitionseq(int ind, String s,List<List<String>> list,List<String> array) {
		
		if(ind == s.length()) {
			list.add(new ArrayList<>(array));
			return;
		}
		
		
		for(int i = ind;i<s.length();i++) {
			
			if(palindrome(s,ind,i)){
				
				array.add(s.substring(ind,i+1));
				partitionseq(i+1, s, list, array);
				array.remove(array.size()-1);
				
			}			
		}
	}

	private boolean palindrome(String s,int start,int end) {

		while(start<=end) {
			if( s.charAt(start) != s.charAt(end)) return false;
			
			start++;
			end--;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 List<List<String>> list =	new PalindromPartitioningUsingRecursion().partition("aabb");
	 
	 for(List a:list) {
		 System.out.println(" "+a);
	 }
	}

}
