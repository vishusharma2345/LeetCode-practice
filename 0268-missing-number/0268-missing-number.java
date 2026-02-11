class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        //n+1 kyuki n numbers chahiye
        boolean arr[]=new boolean [n+1];
        for(int i:nums){
            arr[i]=true;

        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]==false) return i;
        }
        return -1;

    }
}