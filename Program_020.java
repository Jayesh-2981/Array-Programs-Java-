package Shrikant_Sir;

/*
 * 20.Find count of positive and negative elements present in an array. 
 * Ip : a={7, -6, 4, -1, 5}
 * Op : Positive : 3 
 * 		Negative : 2 
 */

public class Program_020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pos = 0;
		int neg = 0;
		int[] arr = { 7, -6, 4, -1, 5 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 0)
				pos++;
			else
				neg++;
		}

		System.out.println("Count of positive elements in an array : " + pos);
		System.out.println("Count of negative elements in an array : " + neg);
	}

}
