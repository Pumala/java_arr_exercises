package arr_exercises;

public class return_nums_in_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {9, 4, 10, 3, 15, 8};
		returnHighestNumInArr(nums);
		returnLowestNumInArr(nums);
	}

	public static void returnHighestNumInArr(int[] arr) {
		int currHighestNum = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > currHighestNum) {
				currHighestNum = arr[i];
			}
		}
		System.out.println(currHighestNum);
	}
	
	public static void returnLowestNumInArr(int[] arr) {
		int currLowestNum = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < currLowestNum) {
				currLowestNum = arr[i];
			}
		}
		System.out.println(currLowestNum);
	}
	
}
