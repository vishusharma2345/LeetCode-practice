class Solution {
    public int hammingWeight(int n) {
        int count=0;
       //String s=String.valueOf(n);
       String bin=Integer.toBinaryString(n);
       int one=0;
       for(int i=0; i<bin.length(); i++){
        
        if(bin.charAt(i)=='1'){
            one++;

        }

        
       }
        return one;
    }
}