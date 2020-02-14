class Solution {
	
	 public void moveZeroes(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (i == 0) {
				int j = i + 1;
				while (j < nums.length && nums[j] == 0) {
					j++;
				}
				
				if (j == i + 1) {
					exchange(i,j);
				} else {
					// 交换区间 i+1~j  int n = j-i //要交换长度
					// 从j+1 ~ j+n
					int n = j-i;
					for (int k = i + 1; k <= i + n; k++,j++) {
						exchange(k,j);
					}
					
				}
			}
		}	
	 }
	
	public static void main(String[] args) {
		
	}
}