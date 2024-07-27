package Shrikant_Sir;

/*
 * 16.Find product of all elements present in an array. 
 * Ip : a={2, 2, 4, 4, 6, 6}
 * Op : 2304 
 */

public class Program_016 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,2,4,4,6,6};
		int product=1;
		
		for (int i : arr) 
			product*=i;
		
		System.out.println("Product of all elements present in an array is : "+product);
	}

}
