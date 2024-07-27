package Shrikant_Sir;

/*
 * 32.Create a clone of 1D array without using clone().
 * Ip : a={4,5,6}
 * Op : copy={4,5,6}
 */

/*
 * 33.Create a clone of 2D array without using clone().
 * Ip : a={{5,6,4},{7,3,8}} 
 * Op : copy={{5,6,4},{7,3,8}} 
 */

/*
 * 34.Create a clone of 3D array without using clone(). 
 * Ip : a={{{1,2},{2,3}},{{4,5},{5,6}}}
 * Op : copy={{{1,2},{2,3}},{{4,5},{5,6}}} 
 */
import java.util.*;

public class Program_032_To_034 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Q.32
		int[] arr1 = { 4, 5, 6 };

		int[] copy1 = new int[arr1.length];
		int index = 0;
		for (int i : arr1)
			copy1[index++] = i;

		System.out.println("copy1=" + Arrays.toString(copy1));

		// Q.33
		int[][] arr2 = { { 5, 6, 4 }, { 7, 3, 8 } };

		int[][] copy2 = new int[arr2.length][arr2[0].length];

		for (int i = 0; i < arr2.length; i++)
			for (int j = 0; j < arr2[i].length; j++)
				copy2[i][j] = arr2[i][j];

		System.out.println("copy2=" + Arrays.deepToString(copy2));

		// Q.34
		int[][][] arr3 = { { { 1, 2 }, { 2, 3 } }, { { 4, 5 }, { 5, 6 } } };

		int[][][] copy3 = new int[arr3.length][][];

		for (int i = 0; i < arr3.length; i++) {
			copy3[i] = new int[arr3[i].length][];
			for (int j = 0; j < arr3[i].length; j++) {
				copy3[i][j] = new int[arr3[i][j].length];
				for (int k = 0; k < arr3[i][j].length; k++) {
					copy3[i][j][k] = arr3[i][j][k];
				}
			}
		}

		System.out.println("copy3=" + Arrays.deepToString(copy3));
	}

}
