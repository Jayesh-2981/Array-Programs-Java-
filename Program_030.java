package Shrikant_Sir;

/*
 * 30. Merge elements of a 2D array. 
 * Ip : a={{4,5,6},{3,2,1}}; 
 * Op: 4 5 6 3 2 1 
 */

public class Program_030 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 4, 5, 6 }, { 3, 2, 1 } };

		for (int[] i : arr)
			for (int j : i)
				System.out.print(j + " ");
	}

}
