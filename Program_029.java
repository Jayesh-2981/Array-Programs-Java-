package Shrikant_Sir;

import java.util.Arrays;

/*
 * 29.Merge three 1D arrays. 
 * Ip : a={1,2,3} 
 * 		b={4,5,6} 
 * 		c={7,8,9} 
 * Op : d={1,2,3,4,5,6,7,8,9}
 */

public class Program_029 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3 };
		int[] b = { 4, 5, 6 };
		int[] c = { 7, 8, 9 };

		int[] d = new int[a.length + b.length + c.length];

		for (int i = 0; i < a.length; i++)
			d[i] = a[i];

		for (int i = 0; i < b.length; i++)
			d[a.length + i] = b[i];

		for (int i = 0; i < c.length; i++)
			d[a.length + b.length + i] = c[i];

		System.out.println("Merged 3 1D array : " + Arrays.toString(d));
	}

}
