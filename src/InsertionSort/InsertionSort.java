package InsertionSort;

public class InsertionSort {

	public void sort(int[] array) {
		// size of the array as s;
		int n = array.length;
		for(int j = 1; j < n; j++) { 					
			int key = array[j];							
			int i = j - 1;								
			while((i > -1) && (array[i] > key)) {		
				array[i+1] = array[i];					
				i--;									
			}
			array[i+1] = key;	
			System.out.println("after " + j + " iteration");
			for(int element: array) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
	}

}
