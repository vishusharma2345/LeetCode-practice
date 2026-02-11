class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        int n=nums.length;
        for(int i:nums){
            set.add(i);
        }
        for(int i=1; i<=n+1; i++){
            if(!set.contains(i))return i;
        }
        return -1;
    }
}