package BubbleSort;

public class Main {
	public static void main(String[] args) {
		int array[] = {99, 1, 45, 3, 7, 9, 5, 23, 44};
		int size = array.length;
		//Creating Object
		BubbleSort bubbleSort = new BubbleSort();
		//Calling Method
		bubbleSort.sort(array, size);
		//Printing Sorted Array
		System.out.println("Sorted Array");
		for(int element: array) {
			System.out.print(element + " ");
		}
	}
}
