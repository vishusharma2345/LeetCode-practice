class Solution {
    public void rotate(int[] nums, int k) {
        
        int n=nums.length;
        k=k%n;
        int[] temp=new int[k];
        //store the elements at start
        for(int i=0; i<k; i++){
            temp[i]=nums[n-k+i];
        }
        //for shifting the remaining elemnts by k times to right
        for(int i=n-1; i>=k; i--){
            nums[i]=nums[i-k];

        }
        //temp vale numbers ko start m daldo
        for(int i=0; i<k; i++){
            nums[i]=temp[i];
        }


       
        
    }
}