import java.util.*;
class Solution {
    public static String addBinary(String a, String b) {
        int i=a.length()-1;
        int j=b.length()-1;
        StringBuilder st=new StringBuilder("");
        int carry=0;
        while(i>=0 || j>=0 || carry==1){
            if(i>=0){
                carry+=a.charAt(i--)-'0';
            }
            if(j>=0){
                carry+=b.charAt(j--)-'0';
            }
            st.append(carry%2);
            carry/=2;
        }
        return st.reverse().toString();
    }
    public static void main(String arg[]){
        System.out.println(addBinary("100","11"));
    }
}