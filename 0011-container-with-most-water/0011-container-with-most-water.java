class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int i=0;
        int j=height.length-1;
        int max=0;
        while(i<j){
            int width=j-i;
            int ht=Math.min(height[i],height[j]);
            int area=width*ht;
            max=Math.max(max,area);
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
            
        }


        
        return max;
    }
}
