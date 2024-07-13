package Shrikant_Sir;

/**
 * Write a java program to Print elements from 1D array using for loop, While
 * loop, do-while loop, for-each loop.
 * 
 * Input : arr[] = {1,2,3,4,5,6}; Output: 1 2 3 4 5 6
 */
public class Program_001_To_004 {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6 };

		// Using for loop

		System.out.println("Using for loop : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("***********************************************");

		// Using while loop

		System.out.println("Using While loop : ");
		int i = 0;
		while (i < arr.length) {
			System.out.print(arr[i] + " ");
			i++;
		}
		System.out.println();
		System.out.println("***********************************************");

		// Using do-while Loop

		System.out.println("Using do-While loop : ");
		int j = 0;
		do {
			System.out.print(arr[j] + " ");
			j++;
		} while (j < arr.length);
		System.out.println();
		System.out.println("***********************************************");

		// Using for-each loop

		System.out.println("Using for-each loop : ");
		for (int k : arr) {
			System.out.print(k + " ");
		}

	}

}
