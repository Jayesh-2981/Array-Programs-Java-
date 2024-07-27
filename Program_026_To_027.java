package Shrikant_Sir;

/*
 * 26.Find sum of all elements at even indices in an array. 
 * Ip : a={6,5,4,3,7,8,0} 
 * Op : 17 
 */

/*
 * 26.Find sum of all elements at even indices in an array. 
 * Ip : a={6,5,4,3,7,8,0} 
 * Op : 16 
 */

public class Program_026_To_027 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 6, 5, 4, 3, 7, 8, 0 };

		int evenSum = 0;
		int oddSum = 0;

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0)
				evenSum += arr[i];
			else
				oddSum += arr[i];
		}

		System.out.println("Sum of all elements at even indices : " + evenSum);
		System.out.println("Sum of all elements at odd indices : " + oddSum);

	}

}
