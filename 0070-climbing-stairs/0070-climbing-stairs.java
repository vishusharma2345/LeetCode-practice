class Solution {
    public int climbStairs(int n) {
        return fun(n);
        
    }
    int fun(int n){
        if(n==0)return 1;
        if(n==1)return 1;
        return fun(n-1)+fun(n-2);
    }
}