class pair{
    int st,ed;
    pair(int st,int ed){
        this.st=st;
        this.ed=ed;
    }
}
class Solution {
    public int[][] merge(int[][] intervals) {
        PriorityQueue<pair> pq= new PriorityQueue<>((a,b)->{
            if(a.st<=b.st) return -1;
            return 1;
        });
        PriorityQueue<pair> ans= new PriorityQueue<>((a,b)->{
            if(a.st<=b.st) return 1;
            return -1;
        });

        int i,j;
        for(i=0;i<intervals.length;i++){
            pq.add(new pair(intervals[i][0],intervals[i][1]));
        }
        ans.add(pq.remove());
        while(pq.size()>0){
            pair temp= pq.remove();
            int s= temp.st;
            int e= temp.ed;
            // System.out.println(s+" "+e);
            // System.out.println(ans.peek().st+" "+ans.peek().ed);
            if(s<=ans.peek().ed){
                pair p= ans.remove();
                ans.add(new pair(Math.min(s,p.st),Math.max(e,p.ed)));
            }
            else{
                ans.add(temp);
            }
        }
        int res[][]= new int[ans.size()][2];
        i=0;
        while(ans.size()>0){
            pair a= ans.remove();
            // System.out.println(a.st+" "+a.ed);
            res[i][0]=a.st;
            res[i][1]=a.ed;
            i++;
        }
        
        return res;
    }
}