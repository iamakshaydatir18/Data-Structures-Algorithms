package Recursion;

public class CountInversionUsingMergeSort {
	// static int count =0;
	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = { 5,3,7,2,1,3};
		
		//new CountInversionUsingMergeSort().mergeSort(0,array.length - 1,array,count);
		System.out.println(" Count is - "+ new CountInversionUsingMergeSort().mergeSort(0,array.length - 1,array));
		for(int a :array) {
			System.out.print(" "+a);
		}

		
		
	}

	public int mergeSort(int i, int j, int[] array) {
			
		int count =0;
		   if( i >= j) return count;
			int mid = (i+j)/2;
			count += mergeSort(i,mid,array);
			count += mergeSort(mid+1,j,array);
			count += merge(i,mid,j,array);
		return count;
	}

	private static int merge(int start, int mid, int end, int[] array) {
		
		int[] temp = new int[array.length];
		int left = start;
		int right = mid +1;
		int i = 0;
		int count = 0;
		while(left <= mid && right <= end) {
			
			if(array[left] > array[right]) {
				temp[i] = array[right];
				right++;
				i++;
			count += (mid-left+1);	
			}else {
				temp[i] = array[left];
				left++;
				i++;
			}
		}
		
		while(left<= mid) {
			temp[i] = array[left];
			left++;
			i++;
		}
		
		while(right<= end) {
			temp[i] = array[right];
			right++;
			i++;
		}
		
		for(int k=start;k<=end;k++) {
			array[k] = temp[k-start];
		}
		
	
		return count;
		
	}

}
