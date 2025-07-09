public class EvenSumSubarrays {
    public static int countEvenSumSubarrays(int[] arr) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) { 
                                int sum = 0;
                for (int j = i; j < n; j++) {
                    sum += arr[j];
                    if (sum % 2 == 0) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(countEvenSumSubarrays(arr)); 
    }
}
