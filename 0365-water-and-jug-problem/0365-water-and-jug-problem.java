class Solution {
    public boolean canMeasureWater(int x, int y, int target) {
        //by RECURSION

        // edge cases
        if(target > x + y) return false;
        if(target == 0) return true;

        int gcd = gcd(x, y);
        return target % gcd == 0;
    }

    int gcd(int dividend, int divisor) {
        if(divisor==0)return dividend;
        return gcd(divisor,dividend%divisor);
        
    }
}