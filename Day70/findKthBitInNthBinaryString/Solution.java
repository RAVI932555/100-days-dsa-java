class Solution {
    public char findKthBit(int n, int k) {
        StringBuilder str=new StringBuilder("011");
        for(int i=1;i<=n-2;i++){
            
            str.append("1"+invert(str));
            System.out.println(str);
            if(str.length()>=k){
                return str.charAt(k-1);
            }
        }
        return str.charAt(k-1);
    }
    public StringBuilder invert(StringBuilder s){
        StringBuilder str=new StringBuilder("");
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1'){
                str.append('0');
            }else{
                str.append("1");
            }
        }
        return str;
    }
}