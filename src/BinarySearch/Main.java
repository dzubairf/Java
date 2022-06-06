package BinarySearch;

public class Main {
	public static void main(String[] args) {
		int array[] = {1, 3, 5, 14, 25, 33, 47, 51, 68, 73, 84, 90};
		int size = array.length;
		int target = 90;
		BinarySearch binarySearch = new BinarySearch();
		int result = binarySearch.search(array, target);
		if(result ==  -1) {
			System.out.println("Element " + target + " is not present in the array");
		}else {
			System.out.println("Element "+ target +" is present at position " + (result + 1));
		}
	}
}
