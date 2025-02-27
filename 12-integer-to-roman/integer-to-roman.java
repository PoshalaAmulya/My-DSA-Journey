class Solution {
    public String intToRoman(int num) {
        TreeMap<Integer,String> hm= new TreeMap<>();
        int i;
        hm.put(1,"I");
        hm.put(5,"V");
        hm.put(4,"IV");
        hm.put(10,"X");
        hm.put(9,"IX");
        hm.put(50,"L");
        hm.put(40,"XL");
        hm.put(100,"C");
        hm.put(90,"XC");
        hm.put(500,"D");
        hm.put(400,"CD");
        hm.put(1000,"M");
        hm.put(900,"CM");
        String ans="";
        while(num>0){
           int n= hm.floorKey(num);
           ans+=hm.get(n);
           num=num-n;
        }
        return ans;

        
        
    }
}