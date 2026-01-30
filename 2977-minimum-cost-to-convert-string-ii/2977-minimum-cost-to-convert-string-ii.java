import java.util.*;

class Solution {
    static final long INF = (long) 1e18;

    public long minimumCost(String source, String target,
                            String[] original, String[] changed, int[] cost) {

        int n = original.length;

        // 1. Collect all unique strings
        Map<String, Integer> id = new HashMap<>();
        int idx = 0;

        for (int i = 0; i < n; i++) {
            if (!id.containsKey(original[i]))
                id.put(original[i], idx++);
            if (!id.containsKey(changed[i]))
                id.put(changed[i], idx++);
        }

        int m = id.size();
        long[][] dist = new long[m][m];

        // 2. Initialize graph
        for (int i = 0; i < m; i++)
            Arrays.fill(dist[i], INF);
        for (int i = 0; i < m; i++)
            dist[i][i] = 0;

        for (int i = 0; i < n; i++) {
            int u = id.get(original[i]);
            int v = id.get(changed[i]);
            dist[u][v] = Math.min(dist[u][v], cost[i]);
        }

        // 3. Floyd–Warshall on strings
        for (int k = 0; k < m; k++) {
            for (int i = 0; i < m; i++) {
                if (dist[i][k] == INF) continue;
                for (int j = 0; j < m; j++) {
                    if (dist[k][j] == INF) continue;
                    dist[i][j] = Math.min(dist[i][j],
                                           dist[i][k] + dist[k][j]);
                }
            }
        }

        // 4. DP over source
        int L = source.length();
        long[] dp = new long[L + 1];
        Arrays.fill(dp, INF);
        dp[L] = 0;

        for (int i = L - 1; i >= 0; i--) {
            // no operation (characters already equal)
            if (source.charAt(i) == target.charAt(i)) {
                dp[i] = dp[i + 1];
            }

            // try all substring replacements
            for (String s : id.keySet()) {
                int len = s.length();
                if (i + len > L) continue;

                if (source.startsWith(s, i)) {
                    int u = id.get(s);
                    for (String t : id.keySet()) {
                        int v = id.get(t);
                        if (dist[u][v] == INF) continue;
                        if (target.startsWith(t, i)) {
                            dp[i] = Math.min(dp[i],
                                    dist[u][v] + dp[i + len]);
                        }
                    }
                }
            }
        }

        return dp[0] >= INF ? -1 : dp[0];
    }
}
