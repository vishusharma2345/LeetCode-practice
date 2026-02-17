class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
         int unplaced=0;
        for(int i=0; i<fruits.length; i++){
            boolean place=false;
            for(int j=0; j<baskets.length; j++){
                if(fruits[i]<=baskets[j]){
                    place=true;
                    baskets[j]=0;
                    break;

                }
            }
            if(place==false){
                unplaced++;
            }

        }
        return unplaced;
    }
}