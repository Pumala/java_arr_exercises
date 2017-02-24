package arr_exercises;
import java.awt.List;
import java.util.ArrayList;

public class arrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create an arr of integers
		int [] arr1 = {14, 2, 17, 35, 11, 80};
		ArrayList<Integer> lynArray = new ArrayList<Integer>();
		lynArray.add(1);
		lynArray.add(2);
		lynArray.add(0, 56);
		lynArray.add(2, 8);
		
		System.out.print(lynArray);
//		]
	}
	
	public static void printArray(String [] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}

}	

	



	