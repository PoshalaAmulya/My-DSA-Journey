class Solution {
    public boolean isAnagram(String s, String t) {
        int i;
        if(s.length()!=t.length())
        return false;
        char[] arr= new char[s.length()];
        arr= s.toCharArray();
        Arrays.sort(arr);
        char[] res= t.toCharArray();
        Arrays.sort(res);
        for(i=0;i<arr.length;i++){
            if(arr[i]!=res[i])
            return false;
        }
        return true;
        
    }
}