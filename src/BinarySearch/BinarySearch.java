package BinarySearch;

public class BinarySearch {
	public int search(int[] array, int target) {
		int start = 0;
		int end = array.length - 1;
		int mid = (start + end)/2;
		while(start <= end) {
			if(array[mid] == target) {
				return mid;
			}
			else if(array[mid] < target) {
				start = mid + 1;
			}
			else {
				end = mid - 1;
			}
			mid = (start + end)/2;
		}
		return -1;
	}
}
