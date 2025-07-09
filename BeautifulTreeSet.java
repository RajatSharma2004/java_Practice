import java.util.*;

public class BeautifulTreeSet {
    static final int MOD = 1_000_000_007;
    static List<Integer>[] children;
    static int[] color;
    static boolean[] used;
    static int maxLen;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of nodes
        int n = Integer.parseInt(sc.nextLine().trim());

        // Skip X, Y, Z (not used in this problem)
        sc.nextLine();
        sc.nextLine();
        sc.nextLine();

        // Read parent array (1-based). parent[1] = 0 by definition.
        int[] parent = new int[n + 1];
        parent[1] = 0;
        for (int i = 2; i <= n; i++) {
            parent[i] = Integer.parseInt(sc.nextLine().trim());
        }

        // Read colors for nodes 1..n
        color = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            color[i] = Integer.parseInt(sc.nextLine().trim());
        }

        // Build the rooted tree's adjacency (children lists)
        children = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            children[i] = new ArrayList<>();
        }
        for (int i = 2; i <= n; i++) {
            children[parent[i]].add(i);
        }

        // Read number of queries (q) and then the q query nodes
        int q = Integer.parseInt(sc.nextLine().trim());
        long total = 0;

        for (int i = 0; i < q; i++) {
            int s = Integer.parseInt(sc.nextLine().trim());
            // Prepare for DFS on subtree rooted at s
            used = new boolean[11];    // colors are in [1..10]
            maxLen = 0;
            dfs(s, 0);
            total = (total + maxLen) % MOD;
        }

        System.out.println(total);
        sc.close();
    }

    // DFS down from node u, current path length = len
    static void dfs(int u, int len) {
        int c = color[u];
        if (used[c]) {
            maxLen = Math.max(maxLen, len);
            return;
        }
        used[c] = true;
        len++;
        maxLen = Math.max(maxLen, len);
        for (int v : children[u]) {
            dfs(v, len);
        }
        used[c] = false;
    }
}
