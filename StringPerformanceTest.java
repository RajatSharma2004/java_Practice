public class StringPerformanceTest {

    public static void main(String[] args) {

        int N = 10000;

        // Case 1: String (Immutable)
        long start1 = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < N; i++) {
            s += i; // Creates a new string every time
        }
        long end1 = System.currentTimeMillis();
        System.out.println("Time with String: " + (end1 - start1) + " ms");

        // Case 2: StringBuilder (Fast, not thread-safe)
        long start2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(i);
        }
        long end2 = System.currentTimeMillis();
        System.out.println("Time with StringBuilder: " + (end2 - start2) + " ms");

        // Case 3: StringBuffer (Thread-safe)
        long start3 = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < N; i++) {
            sbf.append(i);
        }
        long end3 = System.currentTimeMillis();
        System.out.println("Time with StringBuffer: " + (end3 - start3) + " ms");
    }
}
