package SelectionSort;

public class SelectionSort {

	public void sort(int[] array, int size) {
		for(int i = 0; i < size-1; i++) {
			int smallest = i;
			for(int j = i+1; j < size; j++) {
				if(array[j] < array[smallest]) {
					smallest = j;
				}
			}
			int temp = array[smallest];
			array[smallest] = array[i];
			array[i] = temp;
		}
	
	}

}
