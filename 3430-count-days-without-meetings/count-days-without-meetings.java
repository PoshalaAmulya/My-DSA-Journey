class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings,(a,b)->{
            if(a[0]<b[0]){
                return -1;
            }
            if(a[0]==b[0]){
                if(a[1]<b[1]){
                    return -1;
                }
            }
            return 1;
        });
        int end=-1;
        int c=0;
        
        for(int[] m:meetings){
            if(end==-1){
                if(m[0]!=1){
                    c+=m[0]-1;
                }
            }
            if(end!=-1 && m[0]>end){
                c+=m[0]-(end+1);
                
            }
            end=Math.max(end,m[1]);
        }
        if(end<days){
            c+=days-end;
        }
       return c; 
    }
}