class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
        return false;
        HashMap<Character,Character> hm= new HashMap<>();
        int i;
        HashSet<Character> hs1= new HashSet<>();
        HashSet<Character> hs2= new HashSet<>();

        for(i=0;i<s.length();i++){
            hs1.add(s.charAt(i));
            hs2.add(t.charAt(i));
            if(!hm.containsKey(s.charAt(i)))
            hm.put(s.charAt(i),t.charAt(i));
            else{
                if(hm.get(s.charAt(i))!=t.charAt(i)){
                    return false;
                }
            }
        }
        if(hs1.size()!=hs2.size())
        return false;
        return true;
        // int freq1[]= new int[26];
        // int freq2[]= new int[26];
        // int i;
        // for(i=0;i<s.length();i++){
        //     freq1[s.charAt(i)-'a']++;
        //     freq2[t.charAt(i)-'a']++;
        // }
        // Arrays.sort(freq1);
        // Arrays.sort(freq2);
        // for(i=0;i<26;i++){
        //     if(freq1[i]!=freq2[i])
        //     return false;
        // }
        // return true;
        
    }
}