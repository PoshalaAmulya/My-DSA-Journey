class Solution {
    public void gameOfLife(int[][] board) {
        int i,j;
        int m=board.length;
        int n=board[0].length;
        int Board[][]= new int[m][n];
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                Board[i][j]=board[i][j];
            }
        }
        int posx[]={-1,-1,0,1,1,1,0,-1};
        int posy[]={0,1,1,1,0,-1,-1,-1};
        int f=0;
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                int cnt1=0;
                int cnt0=0;
                for(int p=0;p<8;p++){
                    if(i+posx[p]>=0 && i+posx[p]<m && j+posy[p]>=0 && j+posy[p]<n){
                        int x= i+posx[p];
                        int y= j+posy[p];
                        if(Board[x][y]==1){
                            cnt1++;
                        }
                    }
                }
                if(board[i][j]==1){
                    if(cnt1<2 || cnt1>3){
                        // System.out.println(i+""+j+" "+cnt1);
                        board[i][j]=0;
                    }
                }
                else{
                    if(cnt1==3){
                        board[i][j]=1;
                    }
                }
                cnt1=0;cnt0=0;
            }
        }
        return ;
    }
}