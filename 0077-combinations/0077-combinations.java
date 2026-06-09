class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<Integer>nums=new ArrayList<>();
        for(int i=1; i<=n; i++)nums.add(i);
        List<List<Integer>>ans=new ArrayList<>();
        fun(nums,ans,new ArrayList<>(),k,0);
        return ans;
        
    }
    void fun(List<Integer>nums,List<List<Integer>>ans,List<Integer>c,int k,int idx){
        //base case
        if(c.size()==k){
            //parametrized constructor
            ans.add(new ArrayList<>(c));
            return;

        }
        for(int i=idx; i<nums.size(); i++){
            int num=nums.get(i);
            c.add(num);
            //aage vale numbers krne h bss combination h kyuki bas
            fun(nums,ans,c,k,i+1);
            c.remove(c.size()-1);
        }
    }
}