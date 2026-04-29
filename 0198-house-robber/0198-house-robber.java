class Solution {
     int fun(int[]nums,int i){
        if(i==nums.length){
            return 0;
        }
        if(i>=nums.length)return 0;
        int a1=nums[i]+fun(nums,i+2);
        int a2=fun(nums,i+1);
        return Math.max(a1,a2);
        

    }
    public int rob(int[] nums) {
        return fun(nums,0);
       
    }
}