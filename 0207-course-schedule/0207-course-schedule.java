class Solution {
    int find_task(int [] deg){
        int i;
        for(i=0;i<deg.length;i++){
            if(deg[i]==0){
                deg[i]=-1;
                return i;
            }
        }
        return -1;
    }
    public boolean canFinish(int numCourses, int[][] prereq) {
        int [] deg=new int[numCourses] ;
        int i;
        for(i=0;i<prereq.length;i++)
        {
            int t1=prereq[i][0];
            int t2=prereq[i][1];
            deg[t1]++;
        }  
        int z;
        int compctr=0;
    while(true){
       z=find_task(deg);
       if(z==-1) break;
       compctr++;
        for(i=0;i<prereq.length;i++){
            int t1=prereq[i][0];
            int t2=prereq[i][1];
            if(t2==z)
                deg[t1]--;
        }  
     }
        return compctr==numCourses;
    }
}
