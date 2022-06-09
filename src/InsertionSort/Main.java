package InsertionSort;

public class Main {
	public static void main(String[] args) {
		int[] array = {99,8,5,2,4,67,15};
		System.out.println("Before Sorting");
		for(int i: array) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();
		InsertionSort insertionSort = new InsertionSort();
		insertionSort.sort(array);
		System.out.println();
		System.out.println("After Sorting");
		for(int j: array) {
			System.out.print(j + " ");
		}
		
	}
}
