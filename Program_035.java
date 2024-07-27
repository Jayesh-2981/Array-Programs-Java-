package Shrikant_Sir;

import java.util.Arrays;

/*
 * 35.Perform Zig Zag merging of arrays.
 * Ip : a={1,2,3}
 * 		b={4,5,6,7,8}
 * Op : c={1,4,2,5,3,6,7,8} 
 */

public class Program_035 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3 };
		int[] b = { 4, 5, 6, 7, 8 };

		int[] zigzag = new int[a.length + b.length];
		int index = 0;

		for (int i = 0; i < zigzag.length; i++) {
			if (i < a.length)
				zigzag[index++] = a[i];
			if (i < b.length)
				zigzag[index++] = b[i];
		}

		System.out.println("Zigzag Array : " + Arrays.toString(zigzag));
	}

}
