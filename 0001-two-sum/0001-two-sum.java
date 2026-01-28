class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[]=new int[2];
       Map<Integer,Integer> m=new HashMap<>();
       for(int i=0; i<nums.length; i++){
        int other =target -nums[i];
        if(m.containsKey(other)){
            ans[0]=m.get(other); 
            ans[1]=i;
            break;

        }
        m.put(nums[i],i);
       }

      return ans;
      
       
    
    }

}