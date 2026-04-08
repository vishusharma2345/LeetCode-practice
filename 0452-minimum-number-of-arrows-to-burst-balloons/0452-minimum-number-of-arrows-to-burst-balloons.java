class Solution {
    public int findMinArrowShots(int[][] points) {
      Arrays.sort(points,(i1,i2)->Integer.compare(i1[1],i2[1]));
       //ek arrow toh hoga hi minimum
       int arrows=1;
       //f=current flow ka position yha pe 2d array describe kr rhe honge  x and y axis ko 
       int f=points[0][1];
       for(int i=0; i<points.length; i++){
        //agar current position ka start point overlap se bada ho toh no overlap therfore new arrow 
        //matlab ye h ki agar overlap ho toh kuch mt kro or nahi ho toh arrows bdhao
        if(points[i][0]>f){
             arrows++;
            f=points[i][1];

        }
       
       }
       return arrows;
    }
}