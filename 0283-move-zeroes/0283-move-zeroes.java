class Solution {
    public void moveZeroes(int[] nums) {
      int n=nums.length;
      int []temp=new int[n];
      int k=0;
      //for inserting the non zero elements into k
      for(int i=0; i<n; i++){
        if(nums[i]!=0){
            temp[k]=nums[i];
            k++;
        }
      }

      //for inserting back int nums[i]

      for(int i=0; i<n; i++){
        nums[i]=temp[i];
      }
        
        
    }
}