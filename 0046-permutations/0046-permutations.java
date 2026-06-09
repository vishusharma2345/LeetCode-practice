class Solution {
    public List<List<Integer>> permute(int[] nums) {
    //here n=r
    List<Integer>num=new ArrayList<>();
    for(int i:nums)num.add(i);
    //for answers
    List<List<Integer>>ans=new ArrayList<>();
    fun(num,ans,new ArrayList<>());
    return ans;

        
    }
    void fun(List<Integer>nums,List<List<Integer>>ans,List<Integer>p){
        //base case
        if(nums.size()==0){
           
           //copy bna do changes krne k liye
            ans.add(new ArrayList<>(p));
            return;
        }
        //fn calls=n
        //therfore for loop
        for(int i=0; i<nums.size(); i++){
            int num=nums.get(i);
            p.add(num);
            nums.remove(i);
            //dobara fn calls k liye
            fun(nums,ans,p);
            p.remove(p.size()-1);
            //add krna h jo hta rhe hai 
            nums.add(i,num);

        }

    }

}