class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int left=0;
        int count=0;
        int maxcount=0;
        for(int i=0; i<nums.length; i++){
            count++;
            if(nums[i]==0){
                count=0;
            }
            maxcount=Math.max(count,maxcount);

        }
        return maxcount;
    }
}