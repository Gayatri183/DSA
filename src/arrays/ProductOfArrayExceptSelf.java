package arrays;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

	public static int[] product(int[] arr) {
		int n = arr.length;
		int[] result = new int[n];
		
		//prefix sum
		result[0] = 1;
		for(int i=1; i<n; i++) {
			result[i] = result[i-1] * arr[i-1];
		}
		
		//suffix sum
		int right = 1;
		for(int i = n-1; i>=0; i--) {
			result[i] = result[i] * right;
			right = right * arr[i];
		}
		
		return result;
	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4};
		System.out.println(Arrays.toString(product(arr)));
	}

}
