import java.util.*;

class Solution {

    static class State {
        int r, c, t, cost;
        State(int r, int c, int t, int cost) {
            this.r = r;
            this.c = c;
            this.t = t;
            this.cost = cost;
        }
    }

    static class Cell {
        int val, r, c;
        Cell(int val, int r, int c) {
            this.val = val;
            this.r = r;
            this.c = c;
        }
    }

    public int minCost(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        int INF = Integer.MAX_VALUE;

        int[][][] dist = new int[m][n][k + 1];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                Arrays.fill(dist[i][j], INF);

        // Preprocess cells by value
        List<Cell> cells = new ArrayList<>();
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                cells.add(new Cell(grid[i][j], i, j));

        cells.sort(Comparator.comparingInt(a -> a.val));

        // For each teleport count, how far in sorted cells we have processed
        int[] teleportPtr = new int[k + 1];

        PriorityQueue<State> pq =
            new PriorityQueue<>(Comparator.comparingInt(a -> a.cost));

        dist[0][0][0] = 0;
        pq.add(new State(0, 0, 0, 0));

        while (!pq.isEmpty()) {
            State cur = pq.poll();
            int r = cur.r, c = cur.c, t = cur.t, cost = cur.cost;

            if (cost > dist[r][c][t]) continue;

            if (r == m - 1 && c == n - 1)
                return cost;

            // right
            if (c + 1 < n) {
                int nc = cost + grid[r][c + 1];
                if (nc < dist[r][c + 1][t]) {
                    dist[r][c + 1][t] = nc;
                    pq.add(new State(r, c + 1, t, nc));
                }
            }

            // down
            if (r + 1 < m) {
                int nc = cost + grid[r + 1][c];
                if (nc < dist[r + 1][c][t]) {
                    dist[r + 1][c][t] = nc;
                    pq.add(new State(r + 1, c, t, nc));
                }
            }

            // teleport (optimized)
            if (t < k) {
                while (teleportPtr[t] < cells.size()
                        && cells.get(teleportPtr[t]).val <= grid[r][c]) {

                    Cell cell = cells.get(teleportPtr[t]);
                    if (cost < dist[cell.r][cell.c][t + 1]) {
                        dist[cell.r][cell.c][t + 1] = cost;
                        pq.add(new State(cell.r, cell.c, t + 1, cost));
                    }
                    teleportPtr[t]++;
                }
            }
        }

        return -1;
    }
}
