package Shrikant_Sir;

import java.util.Arrays;

/*
 * Both questions are same
 * 23.Find first 10 prime numbers and store it in an array. 
 * Op :a={2,3,5,7,11,13,17,19,23,29} 
 */

public class Program_023_To_024 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		int count = 0;
		int num = 2;
		while (count < 10) {
			if (isPrime(num))
				arr[count++] = num;
			num++;
		}

		System.out.println("First 10 Prime numbers : " + Arrays.toString(arr));
	}

	public static boolean isPrime(int num) {
		// TODO Auto-generated method stub
		if (num <= 1)
			return false;
		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

}
