class Solution {
    public static void fun(int n,int o,int c,String s,ArrayList list){
        if(s.length()==2*n){
            list.add(s);
            return;
        }
        if(o<n){
            fun(n,o+1,c,s+"(",list);
        }
        if(c<o){
            fun(n,o,c+1,s+")",list);
        }
    }
    public List<String> generateParenthesis(int n) {
        ArrayList <String>list=new ArrayList<>();
        fun(n,0,0,"",list);
        return list;
    }
}