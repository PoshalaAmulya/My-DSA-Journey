class Solution {
    public boolean checkPowersOfThree(int n) {
        TreeSet<Integer> ts= new TreeSet<>();
        // if(n%3!=0) return false;
        int l=1;
        int N=n;
        int i;
        ts.add(0);
        ts.add(1);
        int range=(int)(1e7);
        while(l<=range){
            // System.out.println(l);
            ts.add(l);
            l=l*3;
        }
        int sum=0;
        int temp=0;
        HashSet<Integer> hs= new HashSet<>();
        while(n>0){
            temp= ts.floor(n);
            sum=sum+temp;
            n=n-temp;
            if(!hs.contains(temp))
            hs.add(temp);
            else{
                return false;
            }
        
        }
        if(sum==N)
        return true;
        return false;
    }
}