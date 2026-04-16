class Solution {
    public List<String> buildArray(int[] target, int n) {
     //   bhai isme koi stack use hi nhi krna 
      
        List<String>list=new ArrayList<>();
        int j=0;
        for(int i=1; i<=n; i++){
            if(i==target[j]){
                list.add("Push");
                j++;
                if(j==target.length){
                break;
            }
            }
            
            else{
                list.add("Push");
                list.add("Pop");
                
            }
        }
        return list;
        
    }
}