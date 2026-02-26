package Day65.minimummovesToReachtargetScore;

class Solution {
    public int minMoves(int target, int maxDoubles) {
        int count=0;
        while(target!=0 && maxDoubles!=0){
            if(target%2==1){
                count++;
                target=target-1;
            }else{
                target/=2;
                maxDoubles--;
                count++;
            }
        }
        count+=target-1;
        return count;
    }
}
