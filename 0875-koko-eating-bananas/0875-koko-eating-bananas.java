class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=Integer.MIN_VALUE;
        int n=piles.length;
        for(int i=0; i<n; i++){
            if(piles[i]>max){
                max=piles[i];
            }
        }
        for(int k=1; k<=max; k++){
            int hrs=hours(piles,k);
            if(hrs<=h){
                return k;
            }
            
        }
        

        return -1;
    }

    int hours(int piles[],int k){
        int hrs=0;
        for(int i=0; i<piles.length; i++){
            //typecasting
            hrs+=(int)Math.ceil((double)piles[i]/k);
            
        }
        return hrs;
    }
}