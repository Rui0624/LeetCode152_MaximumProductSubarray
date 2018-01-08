
public class Solution {
	public int maxProduct(int[] nums) {
		int res = nums[0]; // create a number to store the result, initialized as the first number
        int n = nums.length; // get the length of nums.
        int[] f = new int[n]; // create an array to store the max product of subarray from nums[0] to nums[i];
        int[] g = new int[n]; // create an array to store the min product of subarray from nums[0] to nums[i]
        f[0] = nums[0]; // f[0] initialized as the first number
        g[0] = nums[0]; // g[0] initialized as the first number
        
        for(int i = 1; i < n; i++){
        	int a = f[i - 1] * nums[i];
        	int b = g[i - 1] * nums[i];
        	
        	f[i] = (a > b ? a : b) > nums[i] ? (a > b ? a : b) : nums[i]; //find the max product from f[i-1] * nums[i], g[i-1]*nums[i], nums[i]
        	g[i] = (a < b ? a : b) < nums[i] ? (a < b ? a : b) : nums[i]; //find the min product from f[i-1] * nums[i], g[i-1]*nums[i], nums[i]
        	
        	res = Math.max(res, f[i]);//update the res
        }
        
        return res;
    }
}
