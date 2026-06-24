class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] leftmax = new int[n];
        int[] rightmax = new int[n];
        int ans = 0;

        // left max
        leftmax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(leftmax[i - 1], height[i]);
        }

        // right max
        rightmax[n - 1] = height[n - 1];
        for (int j = n - 2; j >= 0; j--) {
            rightmax[j] = Math.max(rightmax[j + 1], height[j]);
        }

        // water calculate
        for (int k = 0; k < n; k++) {
            ans += Math.min(leftmax[k], rightmax[k]) - height[k];
        }

        return ans;
    }
}