//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
package arrays;
import java.util.*;

public class TwoSum {
	public static int[] twoSum(int[] arr, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int n = arr.length;
		
		for(int i=0; i<n; i++) {
			int sum = target - arr[i];
			
			if(map.containsKey(sum)) {
				return new int[] {map.get(sum), i};
			}
			
			map.put(arr[i], 0);
		}
		return null;
	}
	
	public static void main(String[] args) {
		int []arr = {2,7,11,15};
		int target = 9;
		System.out.println(Arrays.toString(twoSum(arr, target)));
	}
}

