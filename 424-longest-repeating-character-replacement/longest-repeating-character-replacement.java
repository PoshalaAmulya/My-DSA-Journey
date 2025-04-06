class Solution {
    public int characterReplacement(String s, int k) {
        int i=0,j;
        HashMap<Character,Integer> hm= new HashMap<>();
        int ans=0;
        int maxFreq=0;
        for(j=0;j<s.length();j++){
            char ch= s.charAt(j);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            maxFreq=Math.max(maxFreq,hm.get(ch));
            // int len=j-i+1;
            while((j-i+1)-maxFreq>k){
                char c=s.charAt(i);
                hm.put(c,hm.get(c)-1);
                i++;
                maxFreq=Math.max(maxFreq,hm.get(c));
                // maxFreq=0;
                // for(char x: hm.keySet()){
                //     maxFreq=Math.max(maxFreq,hm.get(x));
                // }
            }
            ans=Math.max(ans,j-i+1);
        }
        return ans;
    }
}