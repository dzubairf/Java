package LinearSearch;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
/* 		
 		// Take input from user 
		System.out.println("Enter the size or array");
		int size = sc.nextInt();
		int array[] = new int[size];
		System.out.println("Please enter the array values");
		for(int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		for(int element :array) {
			System.out.print(element + " ");
		}
*/
		
		int array[] = {57, 67, 12, 56, 97, 58, 59, 34, 7, 23};
		int size = array.length;
		System.out.println("Enter the target value");
		int target = sc.nextInt();
		// Creating Object 
		LinearSearch linearSearch  = new LinearSearch();
		int result = linearSearch.search(array, target, size);
		if(result == -1) {
			System.out.println("Element not present in the list");
		}else {
			System.out.println("Element " + target + " is present at position: " + (result + 1));
		}
		sc.close();
		
	}
}
