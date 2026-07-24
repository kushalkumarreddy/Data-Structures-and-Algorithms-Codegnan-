package Array;

import java.util.List;
import java.util.Arrays;

public class ArrayMethods {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,5,7,9,4);
		System.out.println(nums);
		
		int arr[] = {5,9,2,7,1};
		Arrays.sort(arr);
		System.out.println(arr); //prints address
		System.out.println(Arrays.toString(arr));
		
		int index = Arrays.binarySearch(arr,2);
		System.out.println("Index: "+index);
		
		int arr1[] = {1,2,3};
		int []arr2 = {1,2,3};
		
		Arrays.equals(arr1, arr2);  //check equal or not
		Arrays.compare(arr1, arr2); //Comparison
		
		int st[] = {6,9,3,2};
		int cpy[] = Arrays.copyOf(st, arr.length);
		System.out.println(Arrays.toString(cpy));
		
		int[] cpy1 = Arrays.copyOfRange(st,  2, 4);
		System.out.println(Arrays.toString(cpy1));
		
		int dt[] = new int[6];
		Arrays.fill(dt,  7);
		System.out.println(Arrays.toString(dt));
		
	}

}
