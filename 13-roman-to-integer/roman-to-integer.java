class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> hm= new HashMap<>();
        int i;
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        int ans=0;
        for(i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(i==0){
                ans+=hm.get(ch);
            }
            else{
                if(hm.get(ch)>hm.get(s.charAt(i-1))){
                    ans=ans-hm.get(s.charAt(i-1));
                    ans=ans+hm.get(ch)-hm.get(s.charAt(i-1));
                }
                else{
                    ans+=hm.get(ch);
                }
            }
        }
        return ans;
        
        
    }
}