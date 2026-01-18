class Solution {
    public static int lastRemaining(int n) {
        int head=1;
        int eliminate=n;
        int step=1;
        boolean left=true;
        while(eliminate>1){
            if(left || eliminate%2==1){
                head+=step;
            }
            eliminate/=2;
            step*=2;
            left=!left;

        }
        return head;
    }
    public static void main(String arg[]){
        System.out.println(lastRemaining(9));
    }
    
}