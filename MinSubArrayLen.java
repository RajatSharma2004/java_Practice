public class MinSubArrayLen {
    public static int minSubArrayLen(int target, int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int minLength = Integer.MAX_VALUE;
        int currentSum = 0;
        int start = 0;
        
        for (int end = 0; end < nums.length; end++) {
            currentSum += nums[end];
            while (currentSum >= target) {
                minLength = Math.min(minLength, end - start + 1);
                currentSum -= nums[start];
                start++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        System.out.println("Minimum subarray length: " + minSubArrayLen(target, nums)); // Output: 2
    }
}