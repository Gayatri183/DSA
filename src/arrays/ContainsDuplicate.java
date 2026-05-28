//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

package arrays;
import java.util.*;

public class ContainsDuplicate {
	public static boolean duplicate(int[] nums) {
		HashSet<Integer> set = new HashSet<>();
		
		for(int n : nums) {
			if(set.contains(n)) {
				return true;
			}
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,1};
		System.out.println(duplicate(arr));
	}
}
