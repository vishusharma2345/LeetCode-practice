class Solution {
    public int minOperations(List<Integer> nums, int k) {
        //note set ka name collected ho skta tha for google code quality 
        //newt time yad rkhna
        HashSet<Integer>set=new HashSet<>();
        int count=0;
        int n=nums.size();
        for(int i=n-1; i>=0; i--){
            //We only care about values in range 1 to k"
             if(nums.get(i)<=k){
                set.add(nums.get(i));
                }
                count++;
              if(set.size()==k){
                    break;}
                }
               return count;
    }
}