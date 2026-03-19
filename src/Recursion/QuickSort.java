package Recursion;

public class QuickSort {
	
	private static void QuickSort(int[] array, int low, int high) {
		
		if(low < high) {
			
			int pivot = sort(array,low,high);
			
			QuickSort(array, low, pivot-1);
			QuickSort(array, pivot +1, high);
			
		}
		
	}

	private static int sort(int[] array, int low, int high) {
		// TODO Auto-generated method stub
		int pivot = array[low];
		int i=low;
		int j= high;
		
		while(i < j) {
			
			while(array[i] <= pivot && i <= high-1) {
				i++;
			}
			
			while(array[j] > pivot  && j >= low + 1) {
				j--;
			}
			
			if(i < j) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
				
		}
		
		int temp = array[low];
		array[low] = array[j];
		array[j]= temp;
		
		return j;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {8,3,6,9,6,4,2,7,1};
		int low =0;
		int high = array.length-1;
		System.out.println("length is "+ array.length);
		QuickSort(array,low,high);
		
		System.out.println(" After Sorting array is - ");
		for(int a:array) {
			System.out.print(" "+a);

	}
		
	}

	
}
