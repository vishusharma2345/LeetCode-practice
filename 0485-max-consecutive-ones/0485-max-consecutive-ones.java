class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int sum=0;
        int max=0;
        for(int i=0; i<n; i++){
           // int sum=0;
            if(nums[i]==1){
                sum+=nums[i];
                
            }
            else{
                sum=0;
            }
            max=Math.max(max,sum);


        }
        return max;
    }
}