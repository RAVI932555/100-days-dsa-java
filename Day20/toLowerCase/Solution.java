import java.util.*;
class Solution {
    public static String toLowerCase(String s) {
        StringBuilder st=new StringBuilder("");
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                st.append((char)(s.charAt(i) | ' '));
            }else{
                st.append(s.charAt(i));
            }
            i++;
        }
        return st.toString();
    }
    public static void main(String arg[]){
        System.out.println(toLowerCase("Word"));
    }
}