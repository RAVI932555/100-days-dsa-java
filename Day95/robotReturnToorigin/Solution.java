class Solution {
    public boolean judgeCircle(String moves) {
        int countS=0;
        int countD=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='U'){
                countS++;
            }else if(moves.charAt(i)=='R'){
                countD--;
            }else if(moves.charAt(i)=='L'){
                countD++;
            }else{
                countS--;
            }
        }
       if(countS==0 && countD==0){
        return true;
       }
       return false;
    }
}