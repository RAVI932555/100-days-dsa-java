class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->b[0]-a[0]);
        for(int i=0;i<score.length;i++){
            pq.add(new int[]{score[i],i});
        }
        String[] str=new String[score.length];
        int rank=1;
        while(!pq.isEmpty()){
            int []arr=pq.remove();
            if(rank==1){
                str[arr[1]]="Gold Medal";
            }else if(rank==2){
                str[arr[1]]="Silver Medal";
            }else if(rank==3){
                str[arr[1]]="Bronze Medal";
            }else{
                str[arr[1]]=""+rank;
            }
            rank++;
        }
        return str;
    }
}