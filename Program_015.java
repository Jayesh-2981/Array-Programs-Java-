package Shrikant_Sir;

import java.util.Arrays;

/*
 * 15.Reverse elements in an array.
 * Ip : a={1, 2, 3, 4, 5, 6}
 * Op : 6 5 4 3 2 1 
 */

public class Program_015 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int[] revArr = new int[arr.length];
		int index = 0;
		for (int i = arr.length - 1; i >= 0; i--)
			revArr[index++] = arr[i];

		System.out.println(Arrays.toString(revArr));
	}

}
