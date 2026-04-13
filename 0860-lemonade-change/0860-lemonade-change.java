class Solution {
    public boolean lemonadeChange(int[] bills) {
        int note5=0;
        int note10=0;
        for(int b:bills){
            if(b==5){
                note5++;
            }
            else if(b==10){
                if(note5>0){
                    note5--;
                    note10++;
                }
                else{ return false;}
            }
            else{
                //we will use 10 dollar first bcz we want  as per use
                if(note10>0 &&note5>0){
                    note10--;
                    note5--;
                }
                else if(note5>=3){
                    note5-=3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
        
    }
}