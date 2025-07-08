
import java.util.Scanner;

public class BruteMaxSum {
    static int MOD = 1000000007;
    static int[] A, B, result;
    static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();

        A = new int[N];
        B = new int[N];
        for (int i = 0; i < N; i++) A[i] = sc.nextInt();
        for (int i = 0; i < N; i++) B[i] = sc.nextInt();

        int max = brute(0, X, Y, Z, 0);
        System.out.println(max % MOD);
    }

    static int brute(int i, int x, int y, int z, long sum) {
        if (i == N) return (int)(sum % MOD);

        long option1 = brute(i + 1, x, y, z, sum - B[i]);

        long option2 = Long.MIN_VALUE;
        if (x > 0 && y > 0) {
            long gain = (long) A[i] * (x - 1) * (y - 1) * z;
            option2 = brute(i + 1, x - 1, y - 1, z, (sum + gain));
        }

        long option3 = Long.MIN_VALUE;
        if (y > 0 && z > 0) {
            long gain = (long) A[i] * x * (y - 1) * (z - 1);
            option3 = brute(i + 1, x, y - 1, z - 1, (sum + gain));
        }

        return (int) Math.max(option1, Math.max(option2, option3));
    }
}
