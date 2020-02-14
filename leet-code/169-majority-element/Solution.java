import java.util.*;
import java.security.*;

class Solution {
	
	public static int majorityElement(int[] nums) {
		
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < nums.length; i++) {
			int value = nums[i];
			map.put(value, 0);
		}
		
		for (int i = 0; i < nums.length; i++) {
			int value = nums[i];
			int count = map.get(value);
			count++;
			map.put(value, count);
		}
		
		int halfNum = nums.length/2;
		int result = Integer.MIN_VALUE;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
	            int key = entry.getKey();
				int value = entry.getValue();
				if (value > halfNum) {
					result = key;
					break;	
				}
			}
		return result;
	}
	
	public static int majorityElement1(int[] nums) {
			
			Map<Integer,Integer> map = new HashMap<Integer, Integer>();
			
			for (int i = 0; i < nums.length; i++) {
				int value = nums[i];
				if (map.containsKey(value)) {
					int count = map.get(value);
					map.put(value, count + 1);
				} else {
					map.put(value, 1);
				}
			}
			
			
			int result = Integer.MIN_VALUE;
			int currentCount = 0;
			for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
		            int key = entry.getKey();
					int value = entry.getValue();
					if (value > currentCount) {
						currentCount = value;
						result = key;
					}
				}
			return result;
		}
		
  		
	public static int majorityElement2(int[] nums) {
		Arrays.sort(nums);
		return nums[nums.length/2];
	}
	public static void main(String[] args) {
		int[] nums = {2};
//		int[] nums = {3,2,3};
//		int[] nums = {2,2,1,1,1,2,2};
//		int[] nums = {1,1,1};
		int result = majorityElement2(nums);
		System.out.println(result);
	}
}