package Array;

import java.util.ArrayList;
import java.util.List;

public class Subsequence {

	private static int subse(int i, int[] array, int sum, int k) {

		if (i == array.length) {

			if (sum == k) {
				/*
				 * System.out.print("["); for(int a:list) { System.out.print(a+" "); }
				 * System.out.println("]"); System.out.println("Sum is :"+ sum);
				 */
				return 1;
			} else if (sum > k)
				return 0;
			else
				return 0;
		}

		sum += array[i];
		int l = subse(i + 1, array, sum, k);

		sum -= array[i];

		int r = subse(i + 1, array, sum, k);
		return l + r;
	}

	public static List<List<Integer>> combinationSum(int[] candidates, int target) {

		List<List<Integer>> list = new ArrayList<>();
		List<Integer> arrayList = new ArrayList<>();
		Sequence(candidates, 0, target, list, arrayList, 0);
		return list;
	}

	public static void Sequence(int[] array, int i, int target, List<List<Integer>> list, List<Integer> arrayList,
			int sum) {

		if (i == array.length) {
			if (sum == target) {
				list.add(new ArrayList<>(arrayList));
			}
			return;
		}

		if (array[i] <= target) {
			arrayList.add(array[i]);
			sum += array[i];
			Sequence(array, i, target - array[i], list, arrayList, sum);
			sum -= arrayList.get(arrayList.size() - 1);
			arrayList.remove(arrayList.size() - 1);
		}

		Sequence(array, i + 1, target, list, arrayList, sum);

	}

	public static void main(String[] args) {

		int[] array = { 2, 3, 6, 7 };

		List<List<Integer>> list = combinationSum(array, 7);
		for (List l : list) {

			System.out.println(" " + l);
		}

		/*
		 * List<Integer> a1 = new ArrayList<>(); a1.add(1); a1.add(4); a1.add(7);
		 * a1.add(6); List<Integer> a2 = new ArrayList<>(); a2.add(6); a2.add(4);
		 * a2.add(1); a2.add(7);
		 */

	}

}
