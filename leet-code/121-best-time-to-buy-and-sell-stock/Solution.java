
class Solution {
	
	public static int maxProfit(int[] prices) {
		int result = 0;
		int N = prices.length;
		for (int i = 0; i < N; i++) {
			for (int j = i+1; j < N; j++) {
				int price = prices[j] - prices[i];
				result = Math.max(result, price);
			}
		}
		
		return result;	
	}
	
	public static int maxProfit1(int[] prices) {
			int N = prices.length;
			int minPirce = Integer.MAX_VALUE;
			int maxProfit = 0;
			for (int i = 0; i < N; i++) {
				if (prices[i] < minPirce) {
					minPirce = prices[i];
				} else if(prices[i] - minPirce > maxProfit) {
					maxProfit = prices[i] - minPirce;
				}
			}
			
			return maxProfit;	
		}
	
	public static void main(String[] args) {
		test0();
		test1();
	}
	
	public static void test0() {
		int[] prices = {7,1,5,3,6,4};
		int result = maxProfit1(prices);
		System.out.println(result);
	}
	
	public static void test1() {
		int[] prices = {7,6,4,3,1};
		int result = maxProfit1(prices);
		System.out.println(result);
	}
}