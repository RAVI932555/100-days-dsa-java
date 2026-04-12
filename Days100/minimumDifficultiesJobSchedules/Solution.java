package Days100.minimumDifficultiesJobSchedules;

class Solution {

    private int t[][];
    public int minDifficulty(int[] jobDifficulty, int d) {
        
        int n=jobDifficulty.length;
        if(n<d){
            return -1;
        }

        t=new int[n][d+1];
        for (int[] row : t) {
            Arrays.fill(row, -1);
        }
        return solve(jobDifficulty,n,0,d);

    }
    public int solve(int []job, int n ,int i,int d){
        //base case

        if(d==1){
            int maxD=Integer.MIN_VALUE;
            for(int j=i;j<n;j++){
                maxD=Math.max(maxD,job[j]);
            }
            return maxD;
        }
        if(t[i][d]!=-1){
            return t[i][d];
        }
        int maxV=job[i];
        int finalResult=Integer.MAX_VALUE;

        for(int k=i;k<=n-d;k++){
            maxV=Math.max(maxV,job[k]);
            int result=maxV+solve(job,n,k+1,d-1);
            finalResult=Math.min(finalResult,result);
        }

        return t[i][d]=finalResult;
    }
}