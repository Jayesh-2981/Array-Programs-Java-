package Shrikant_Sir;

import java.util.Arrays;

/*
 * 21.Find odd elements and store it in a new array. 
 * Ip : a={1, 2, 3, 4, 5, 6} 
 * Op :b={1,3,5}
 */
/*
 * 22.Find even elements and store it in a new array. 
 * Ip : a={1, 2, 3, 4, 5, 6}
 * Op :b={2,4,6}
 */

public class Program_021_To_022 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int evenCount = 0;
		int oddCount = 0;

		// For getting the size of an even and odd array
		for (int i : arr) {
			if (i % 2 == 0)
				evenCount++;
			else
				oddCount++;
		}

		int[] evenArray = new int[evenCount];
		int[] oddArray = new int[oddCount];

		// For storing even and odd elemetns in there respective arrays
		int evenIndex = 0;
		int oddIndex = 0;
		for (int i : arr) {
			if (i % 2 == 0)
				evenArray[evenIndex++] = i;
			else
				oddArray[oddIndex++] = i;
		}

		System.out.println("Odd elements in given array : " + Arrays.toString(oddArray));
		System.out.println("Even elements in given array : " + Arrays.toString(evenArray));
	}

}
