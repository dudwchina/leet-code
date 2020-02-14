import java.util.*;

class TwoSum {
	
	public int[] twoSum1(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				int secondNum = nums[j];
				if (secondNum == target - nums[i]) {
				    return new int[] { i, j };
				}
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}
	
	public int[] twoSum2(int[] nums, int target) {
		int N = nums.length;
		Map<Integer,Integer> numsMap = new HashMap<Integer, Integer>(N);
		for (int i = 0; i < N; i++) {
			numsMap.put(nums[i], i);
		}
		
		for (int i = 0; i < N; i++) {
			Integer expectedNum = target - nums[i];
			if (numsMap.containsKey(expectedNum) && numsMap.get(expectedNum) != i) {
				return new int[] {i, numsMap.get(expectedNum)};
			}
		}
		throw new IllegalArgumentException("No two sum solution");
		
	}
	
	public int[] twoSum3(int[] nums, int target) {
			int N = nums.length;
			Map<Integer,Integer> numsMap = new HashMap<Integer, Integer>(N);
			for (int i = 0; i < N; i++) {
				Integer expectedNum = target - nums[i];
				if (numsMap.containsKey(expectedNum)) {
					return new int[] {i, numsMap.get(expectedNum)};
				} else {
					numsMap.put(nums[i], i);
				}
			}
			
			throw new IllegalArgumentException("No two sum solution");
			
		}
	public static void main(String[] args) {
		
	}
}