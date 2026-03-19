package Recursion;

public class MergeSort {

	public static void main(String[] args) {
		
		int[] array = {8,3,6,9,6,4,2,7,1};
		int low =0;
		int high = array.length-1;
		
		MergeSort(array,low,high);
		
		System.out.println(" After Sorting array is - ");
		for(int a:array) {
			System.out.print(" "+a);
		}
	}

	private static void MergeSort(int[] array, int low, int high) {
		
		if(low == high) return;
		
		int mid = (low+high)/2;
		
		MergeSort(array,low,mid);
		MergeSort(array,mid+1,high);
		
		Merge(array,low,mid,high);
	}

	private static void Merge(int[] array, int low, int mid, int high) {
		
		int left = low;
		int right = mid+1;
		int[] temp = new int[array.length];
		int i=0;
		
		while(left<=mid && right<= high) {
			if(array[left] <= array[right]) {
				temp[i] = array[left];
				left++;
			}else {
				temp[i] = array[right];
				right++;
			}
			
			i++;
		}
		
		while(left <= mid) {
			temp[i] = array[left];
			left++;
			i++;
		}
		
		while(right <= high) {
			temp[i] = array[right];
			right++;
			i++;
		}
		
		for(int k=low;k<=high;k++) {
			array[k] = temp[k-low];
		}
		
	}

}
