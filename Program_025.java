package Shrikant_Sir;

import java.util.Arrays;

/*
 * 25.Find first 10 Fibonacci numbers and store it in an array. 
 * Op :a={0,1,1,2,3,5,8,13,21,34} 
 */

public class Program_025 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];

		arr[0] = 0;
		arr[1] = 1;

		for (int i = 2; i < arr.length; i++)
			arr[i] = arr[i - 1] + arr[i - 2];

		System.out.println("First 10 Fibonacci numbers are : " + Arrays.toString(arr));

	}

}
