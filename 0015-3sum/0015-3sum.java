class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lis = new ArrayList<>();
        int n = nums.length;

        Arrays.sort(nums); // step 1: sort

        for(int i = 0; i < n - 2; i++) {

            // 🔹 skip duplicate i
            if(i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = n - 1;

            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if(sum < 0) {
                    left++;
                }
                else if(sum > 0) {
                    right--;
                }
                else {
                    // ✅ found triplet
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    lis.add(temp);

                    // move pointers
                    left++;
                    right--;

                    // 🔹 skip duplicate left
                    while(left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }

                    // 🔹 skip duplicate right
                    while(left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                }
            }
        }
        return lis;
    }
}