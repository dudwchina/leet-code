
class Solution {
	
	public void moveZeroes(int[] nums) {
		int n = nums.length;
		int index = 0;
		for (int i = 0; i < n; i++) {
			int num = nums[i];
			if (num != 0) {
				nums[index++] = num;
			}
		}
		
		while (index < n) {
			nums[index++] = 0;
		}	
			
	}
	public static void main(String[] args) {
		
	}
}