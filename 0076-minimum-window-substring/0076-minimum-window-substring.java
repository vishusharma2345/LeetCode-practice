class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length()) return "";

        int[] freq = new int[128];

        // fill freq from t
        for(char c : t.toCharArray()){
            freq[c]++;
        }

        int l = 0, r = 0;
        int count = t.length();

        int minLen = Integer.MAX_VALUE;
        int start = 0;

        while(r < s.length()){
            // expand window
            if(freq[s.charAt(r)] > 0){
                count--;
            }
            freq[s.charAt(r)]--;

            r++;

            // valid window
            while(count == 0){
                // update answer
                if(r - l < minLen){
                    minLen = r - l;
                    start = l;
                }

                // shrink window
                freq[s.charAt(l)]++;
                if(freq[s.charAt(l)] > 0){
                    count++;
                }

                l++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}