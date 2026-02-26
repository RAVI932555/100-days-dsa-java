package Day65.NumberofStepstoReduceaNumberinBinaryRepresentationtoOn;

class Solution {
    public int numSteps(String s) {
        int n=s.length();
        int carry=0;
        int opr=0;
        for(int i=n-1;i>0;i--){
            if(((s.charAt(i)-'0')+carry)%2==1){
                opr+=2;
                carry=1;
            }else{
                opr+=1;
            }
        }
        return opr+carry;
    }
}