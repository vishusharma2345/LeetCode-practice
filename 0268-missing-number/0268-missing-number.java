class Solution {
    public int missingNumber(int[] nums) {
        //no sorting due to time complexity
        int n=nums.length;
       // sum of nat numb
       int sum=0;
       int ans=0;
       int nat=n*(n+1)/2;
       for(int i=0; i<n; i++){
        sum+=nums[i];
       



       }
       return nat-sum;

    }
}