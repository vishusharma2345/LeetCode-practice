class Solution {
    public int fib(int n) {
        //by memoization=big o n
        int dp[]=new int[n+1];
        return fibonacci(n,dp);
        }
       public int fibonacci(int n,int dp[]){
        if(n==0)return 0;
        if(n==1)return 1;
       if(dp[n]!=0){
        return dp[n];
       }
       return dp[n]=fib(n-1)+fib(n-2);
        
        }



        
    
}