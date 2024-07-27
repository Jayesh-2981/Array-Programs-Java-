package Shrikant_Sir;

/*
 * 14.Find sum of all elements present in an array. 
 * Ip : a={2, 2, 4, 4, 6, 6}
 * Op : 24 
 */

public class Program_014 {

	public static void main(String[] args) {

		int[] arr = { 2, 2, 4, 4, 6, 6 };

		int sum = 0;
		for (int i : arr)
			sum += i;

		System.out.println("Sum of all elements present in an array is : " + sum);
	}
}
