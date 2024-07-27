package Shrikant_Sir;

/*
 * 13.Find number of elements without using length variable. 
 * Ip : a={1, 2, 3, 4, 5, 6} 
 * Op : 6
 */

public class Program_013 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6 };

		int length = 0;
		for (int i : arr)
			length++;

		System.out.println("Length of the given array is : " + length);
	}

}
