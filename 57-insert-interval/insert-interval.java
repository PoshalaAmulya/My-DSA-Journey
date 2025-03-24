class Pair{
    int st,ed;
    Pair(int st,int ed){
        this.st=st;
        this.ed=ed;
    }
}
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        PriorityQueue<Pair> pq= new PriorityQueue<>((a,b)->{
            if(a.st<b.st) return -1;
            return 1;
        });
        ArrayList<ArrayList<Integer>> li= new ArrayList<>();
        int[][] ans;
        int i;
        for(i=0;i<intervals.length;i++){
            pq.add(new Pair(intervals[i][0],intervals[i][1]));
        }
        pq.add(new Pair(newInterval[0],newInterval[1]));
        Pair pp= pq.remove();
        int st= pp.st;
        int ed= pp.ed;
        int k=0;
        while(pq.size()>0){
            Pair p= pq.remove();
            if(p.st<=ed){
                st=Math.min(st,p.st);
                ed=Math.max(ed,p.ed);
            }
            else{
                ArrayList<Integer> al= new ArrayList<>();
                al.add(st);
                al.add(ed);
                li.add(al);
               
                st=p.st;
                ed=p.ed;
            }
        }
        ArrayList<Integer> al= new ArrayList<>();
        al.add(st);
        al.add(ed);
        li.add(al);
        ans= new int[li.size()][2];
        for(ArrayList<Integer> l: li){
            ans[k][0]=l.get(0);
            ans[k][1]=l.get(1);
            k++;
        }
        return ans;
    }
}