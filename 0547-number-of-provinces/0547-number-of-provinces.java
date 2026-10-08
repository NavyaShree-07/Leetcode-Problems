class Solution {
    void fun(int [][]adjmat,int wvert,boolean[] vis){
        for(int col=0;col<adjmat[wvert].length;col++){
            if(adjmat[wvert][col]>0 && vis[col]==false){
                    vis[col]=true;
                    fun(adjmat,col,vis);
                }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int c=0;
        boolean []vis = new boolean[isConnected.length+1];
        for(int idx=0;idx<isConnected.length;idx++){
            if(vis[idx]==false){
                fun(isConnected,idx,vis);
                c++;
            }
        }
        return c;
    }
}