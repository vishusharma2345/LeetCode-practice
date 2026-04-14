class Solution {
    public String minWindow(String s, String t) {
        //kyuki dono characters hein:
        int[]fr=new int[128];
        for(char c:t.toCharArray()){
            fr[c]++;
        }
        int left=0; int right=0;
        int count=t.length(); int start=0;
        int minlength=Integer.MAX_VALUE;
        while(right<s.length()){
            char r=s.charAt(right);
            if(fr[r]>0){
                count--;

            }
            fr[r]--;
            right++;
            while(count==0){
                if(right-left<minlength){
                    minlength=right-left;
                    start=left;
                }
                char l=s.charAt(left);
                fr[l]++;
                if(fr[l]>0){
                    count++;
                }
                left++;
            }

        }
        if(minlength==Integer.MAX_VALUE){
            return "";
        }else{
            return s.substring(start,start+minlength);
        }
    }
}