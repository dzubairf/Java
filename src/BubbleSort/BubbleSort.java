package BubbleSort;

public class BubbleSort {

	public void sort(int[] array, int size) {
		for(int i = 0; i < size; size--) {
			for(int j = i; j < size - 1; j++) {
				int k = j + 1;
				int temp;
				if(array[j] > array[k]) {
					temp = array[j];
					array[j] = array[k];
					array[k] = temp;
				}
			}
		}
	}

}
