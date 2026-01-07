class Solution {
    public static int myAtoi(String s) {
        int negative=1;
        int j=0;
        if(s.length()==0){
            return 0;
        }
        while(j<s.length() && s.charAt(j)==' '){
            j++;
        }
        if(j<s.length() && s.charAt(j)=='-'){
            negative=-1;
            j++;
        }else if(j<s.length() && s.charAt(j)=='+'){
            j++;
        }
        long ans=0;
        int pow=0;
        while(j<s.length() && (s.charAt(j)-'0')>=0 && (s.charAt(j)-'0')<=9){
            ans=ans*10+(s.charAt(j)-'0');
            if(negative* ans>Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(negative * ans<Integer.MIN_VALUE) return Integer.MIN_VALUE;
            j++;
        }
        return (int) (negative * ans);
    }
    public static void main(String arg[]){
        System.out.println(myAtoi("-4234"));
    }
}