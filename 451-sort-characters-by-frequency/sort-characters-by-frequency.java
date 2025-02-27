class pair{
    char ch;
    int freq;
    int idx;
    pair(char ch,int freq){
        this.ch=ch;
        this.idx=idx;
        this.freq=freq;
    }
}
class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> hm= new HashMap<>();
        PriorityQueue<pair> pq= new PriorityQueue<>((a,b)->{
            if(a.freq>b.freq){
                return -1;
            }
            return 1;
        });
        int i;
        for(i=0;i<s.length();i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        for(char ch: hm.keySet()){
            pq.add(new pair(ch,hm.get(ch)));
        }
        String ans="";
        while(pq.size()>0){
            pair p= pq.remove();
            char c= p.ch;
            int f= p.freq;
            for(int j=0;j<f;j++){
                ans+=c;
            }
        }
        return ans;
        
    }
}