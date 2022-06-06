package SelectionSort;

public class Main {
	public static void main(String[] args) {
		int array[] = {8, 4, 6, 9, 2, 3, 1};
		int size = array.length;
		SelectionSort selectionSort = new SelectionSort();
		selectionSort.sort(array, size);
		System.out.print("[ ");
		for(int i: array) {
			System.out.print(i + " ");
		}
		System.out.print("]");
	}
}
