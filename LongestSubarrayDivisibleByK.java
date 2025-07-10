import java.util.HashMap;

public class LongestSubarrayDivisibleByK {
    public static int longestSubarray(int[] arr, int k) {
        HashMap<Integer, Integer> remainderMap = new HashMap<>();
        remainderMap.put(0, -1); 
        int sum = 0, maxLength = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            int remainder = ((sum % k) + k) % k; 
            
            if (remainderMap.containsKey(remainder)) {
                maxLength = Math.max(maxLength, i - remainderMap.get(remainder));
            } else {
                remainderMap.put(remainder, i);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 6, 1, 4, 5};
        int k = 3;
        System.out.println("Longest subarray length with sum divisible by " + k + ": " + longestSubarray(arr, k)); // Output: 4
    }
}