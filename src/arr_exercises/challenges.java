package arr_exercises;

public class challenges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create an arr of integers
		int [] arr1 = {14, 2, 17, 35, 11, 80};
//		printArray(arr1);
//		printEvenArray(arr1);
//		printSumEvens(arr1);
		printOddIndices(arr1);
	}
	
	public static void printArray(int [] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}
	
	public static void printEvenArray(int [] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i] + ", ");
			}
		}
	}
	
//	public static void printOddArray()

	public static void printSumEvens(int [] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				sum = sum + arr[i];
			}
		}
		System.out.println(sum);
	}
	
	public static void printOddIndices(int [] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 != 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}
}
