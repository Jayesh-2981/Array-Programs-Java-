package Shrikant_Sir;

import java.util.Arrays;

/*
 * 31.Find factors of a number and store them in an array. 
 * Ip : num : 12 
 * Op : a={1,2,3,4,6,12} 
 */

public class Program_031 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12;
		int size = 0;

		for (int i = 1; i <= num; i++) {
			if (num % i == 0)
				size++;
		}

		int[] arr = new int[size];
		int index = 0;
		for (int i = 1; i <= num; i++)
			if (num % i == 0)
				arr[index++] = i;

		System.out.println("arr = " + Arrays.toString(arr));
	}

}
