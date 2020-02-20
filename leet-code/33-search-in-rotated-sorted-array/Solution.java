import java.util.*;

class Solution {
	
	public static int search(int[] nums, int target) {
		if (nums.length < 1) {
			return -1;
		}
		
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		
		if (map.containsKey(target)) {
			return map.get(target);
		} else {
			return -1;
		}
			
	}
	public static void main(String[] args) {
		int[] nums = {4,5,6,7,0,1,2};
		int result = search(nums, 3);
		System.out.println(result);
	}
}