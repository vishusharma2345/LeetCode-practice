class Solution {
    public int findMinArrowShots(int[][] points) {
       Arrays.sort(points,(i1,i2)->Integer.compare(i1[1],i2[1]));
       int arrows=1;
       int f=points[0][1];
       for(int i=0; i<points.length; i++){
        if(points[i][0]>f){
             arrows++;
            f=points[i][1];

        }
       
       }
       return arrows;
    }
}