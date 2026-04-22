class Solution {
    public int climbStairs(int n) {
        return fun(0,n);
        
       
    }
    int fun(int i,int n){
        if(i==n)return 1;
        if(i>n)return 0;
        int ways=fun(i+1,n);
        int ways2=fun(i+2,n);
        return ways+ways2;
    }
}