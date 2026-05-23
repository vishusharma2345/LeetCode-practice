
class Solution {

    // Main method: checks if array is a valid rotated sorted array
    public boolean check(int[] nums) {

        // drops counts how many times the sequence "falls" (a descent occurs)
        int drops = 0;

        // Traverse consecutive pairs to count descents in the linear portion
        for (int i = 1; i < nums.length; i++) {

            // If previous element is greater than current, it's a drop
            if (nums[i - 1] > nums[i]) {
                drops++; // Increment drop counter
            }
        }

        // Check the wrap-around: last element compared to first (circular check)
        if (nums[nums.length - 1] > nums[0]) {
            drops++; // Wrap-around drop found → another descent at rotation boundary
        }

        // A valid rotated sorted array has at most 1 drop (the rotation point)
        // 0 drops → already sorted, 1 drop → exactly one rotation, 2+ → invalid
        return drops < 2;
    }
}