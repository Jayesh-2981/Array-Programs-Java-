package Shrikant_Sir;

import java.util.Arrays;

/*
 * 28.Merge two 1D arrays. 
 * Ip : a={1,2,3} 
 * 	  	b={4,5,6} 
 * Op : c={1,2,3,4,5,6} 
 */

public class Program_028 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3 };
		int[] b = { 4, 5, 6 };

		int[] c = new int[a.length + b.length];

		for (int i = 0; i < a.length; i++)
			c[i] = a[i];

		for (int i = 0; i < b.length; i++)
			c[a.length + i] = b[i];

		System.out.println("Merged 2 1D array : " + Arrays.toString(c));

	}

}
