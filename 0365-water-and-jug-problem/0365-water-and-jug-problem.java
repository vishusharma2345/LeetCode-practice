class Solution {
    public boolean canMeasureWater(int x, int y, int target) {

        // edge cases
        if(target > x + y) return false;
        if(target == 0) return true;

        int gcd = gcd(x, y);
        return target % gcd == 0;
    }

    int gcd(int a, int b) {
        while(b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }
}