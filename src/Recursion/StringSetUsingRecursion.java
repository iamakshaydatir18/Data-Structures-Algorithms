package Recursion;

import java.util.ArrayList;

public class StringSetUsingRecursion {

	public static void subseq(int ind, String s, ArrayList<ArrayList<Character>> list, ArrayList<Character> seq) {

		/* for generating all subsets
		 * if(i == s.length()) { list.add(new ArrayList<>(seq)); return; }
		 * 
		 */

		
		//for generating all unique sets
		list.add(new ArrayList<>(seq));

		for (int i = ind; i < s.length(); i++) {

			if (i != ind && s.charAt(i) == s.charAt(i - 1))
				continue;

			seq.add(s.charAt(i));
			subseq(i + 1, s, list, seq);
			seq.remove(seq.size() - 1);
		}

		//for generating all subsets
		/*
		 * seq.add(s.charAt(i)); subseq(i+1, s, list, seq); seq.remove(seq.size()-1);
		 * subseq(i+1, s, list, seq);
		 */

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<ArrayList<Character>> list = new ArrayList<>();

		subseq(0, "aabb", list, new ArrayList<>());

		for (ArrayList a : list) {
			System.out.println(" " + a);
		}
	}

}
