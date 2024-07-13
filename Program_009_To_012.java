package Shrikant_Sir;

/*
 * Write a java program to Print elements from 3D array using for loop, while loop, do-while loop, for-each loop.
 * 
 * i/p : arr={{{1,2},{3,4}},{{5,6},{7,8}}};
 * o/p : 1 2
 * 		 3 4
 * 		 5 6
 * 		 7 8
 */
public class Program_009_To_012 {

	public static void main(String[] args) {

		int[][][] arr = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };

		// Using for loop

		System.out.println("Using for loop : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.print(arr[i][j][k] + " ");
				}
				System.out.println();
			}
		}
		System.out.println("***********************************************");

		// Using while loop

		System.out.println("Using while loop : ");
		int i = 0;
		while (i < arr.length) {
			int j = 0;
			while (j < arr[i].length) {
				int k = 0;
				while (k < arr[i][j].length) {
					System.out.print(arr[i][j][k] + " ");
					k++;
				}
				j++;
				System.out.println();
			}
			i++;
		}
		System.out.println("***********************************************");

		// Using do-while loop

		System.out.println("Using do-while loop : ");
		int j = 0;
		do {
			int k = 0;
			do {
				int l = 0;
				do {
					System.out.print(arr[j][k][l] + " ");
					l++;
				} while (l < arr[j][k].length);
				System.out.println();
				k++;
			} while (k < arr[j].length);
			j++;
		} while (j < arr.length);
		System.out.println("***********************************************");
		
		//Using for-each loop
		
		System.out.println("Using for-each loop : ");
		
		for (int[][] k : arr) {
			for (int[] l : k) {
				for (int m : l) {
					System.out.print(m+" ");
				}
				System.out.println();
			}
		}

	}

}
