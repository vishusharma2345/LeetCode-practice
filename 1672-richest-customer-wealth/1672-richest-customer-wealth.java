class Solution {
    public int maximumWealth(int[][] accounts) {
        int n=accounts.length;
        //int m=accounts.length;
        //int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            int sum=0;//to reset for each row
            for(int j=0; j<accounts[i].length; j++){
                 sum+=accounts[i][j];
                if(sum>max){
                    max=sum;
                }
            }
        }
        return max;
        
    }
}