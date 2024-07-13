package Shrikant_Sir;

/*
 * Write a java program to Print elements from 2D array using for loop, While loop, do-while loop, for-each loop.
 * Input : a={{1,2,3},{4,5,6}};
 * Output: 1 2 3
 * 		   4 5 6
 */

public class Program_005_To_008 {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 } };

		// Using for loop

		System.out.println("Using For loop : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++)
				System.out.print(arr[i][j] + " ");

			System.out.println();
		}

		System.out.println("***********************************************");

		// Using while loop

		System.out.println("Using While loop : ");

		int i = 0;
		while (i < arr.length) {
			int j = 0;
			while (j < arr[i].length) {
				System.out.print(arr[i][j] + " ");
				j++;
			}
			i++;
			System.out.println();
		}
		System.out.println("***********************************************");

		// Using do-while loop

		System.out.println("Using do-while loop : ");
		int j = 0;
		do {
			int k = 0;

			do {
				System.out.print(arr[j][k] + " ");
				k++;
			} while (k < arr[j].length);

			System.out.println();
			j++;
		} while (j < arr.length);
		System.out.println("***********************************************");

		// Using for-each loop
		System.out.println("Using for-each loop : ");
		for (int[] k : arr) {
			for (int l : k) {
				System.out.print(l + " ");
			}
			System.out.println();
		}
	}

}
