class Solution {
    void fun(int n,int o,int c,String s,List<String>lis){
        if(s.length()==2*n){
            lis.add(s);
            return;
        }
       if(o<n){
        fun(n,o+1,c,s+"(",lis);
       }

       if(c<o){
        fun(n,o,c+1,s+")",lis);
       }

    }
    public List<String> generateParenthesis(int n) {
        List<String> lis=new ArrayList<>();
        fun(n,0,0,"",lis);
        return lis;


    }
}