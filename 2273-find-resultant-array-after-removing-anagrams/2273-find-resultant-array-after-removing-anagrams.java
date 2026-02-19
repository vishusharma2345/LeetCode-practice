class Solution {
    public List<String> removeAnagrams(String[] words) {
        ArrayList<String>lis=new ArrayList<>();
        lis.add(words[0]);
        for(int i=0; i<words.length; i++){
            if(!ans(lis.get(lis.size()-1),words[i])){
                lis.add(words[i]);
            }


        }
        return lis;
    }
     static boolean ans(String a,String b){
        char[] ch=a.toCharArray();
        char[] sh=b.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(sh);
        return Arrays.equals(ch,sh);

     } 

    }
