package Shrikant_Sir;

/*
 * 17.Find all even elements present in an array. 
 * Ip : a={2, 8, 5, 4, 7, 9}
 * Op : 2 8 4
 */

/*
 * 18.Find all odd elements present in an array. 
 * Ip : a={2, 8, 5, 4, 7, 9}
 * Op : 5 7 9 
 */

/*
 * 19.Find all prime elements present in an array. 
 * Ip : a={2, 8, 5, 4, 7, 9}
 * Op : 2 5 7 
 */

public class Program_017_To_019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 8, 5, 4, 7, 9 };

		// for finding Even Elements from array
		System.out.print("All even elements present in an array are : ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}

		System.out.println();

		// for finding odd elements from array
		System.out.print("All odd elements present in an array are : ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				System.out.print(arr[i] + " ");
			}
		}

		System.out.println();

		// for finding prime elements from array
		System.out.print("All prime elements present in an array are : ");
		for (int i : arr)
			if (isprime(i))
				System.out.print(i + " ");
	}

	public static boolean isprime(int i) {
		// TODO Auto-generated method stub
		if (i <= 1)
			return false;
		for (int j = 2; j < i; j++)
			if (i % j == 0)
				return false;

		return true;
	}

}
