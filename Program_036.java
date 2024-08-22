package Shrikant_Sir;

/*
 * 36.Find duplicate elements in an array. 
 * Ip : a={6,5,4,6,5,8,6} 
 * Op : 6 , 5 
 */

public class Program_036 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 6, 5, 4, 6, 5, 8, 6 };
		findDuplicate(arr);
	}

	public static void findDuplicate(int[] arr) {
		// TODO Auto-generated method stub
		boolean[] visited = new boolean[arr.length];

		for (int i = 0; i < arr.length; i++) {
			if (!visited[i]) {
				boolean isDuplicate = false;
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						visited[j] = true;
						isDuplicate = true;
					}
				}

				if (isDuplicate)
					System.out.print(arr[i] + " ");
			}
		}
	}

}
