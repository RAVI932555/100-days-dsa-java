import java.util.*;
class Solution {
    public static int compress(char[] chars) {
        StringBuilder st=new StringBuilder("");
        st.append(chars[0]);
        int count=1;
        for(int i=1;i<chars.length;i++){
            if(chars[i]==chars[i-1]) count++;
            else
                if(count>1) st.append(count);
                st.append(chars[i]);
                count=1;
        }
        if(count>1){
            st.append(count);
        }
        for(int i=0;i<st.length();i++){
            chars[i]=st.charAt(i);
        }
        return st.length();
    }
    public static void main(String arg[]){
        char ch[]={'a','a','b','b','c','c','c'};
        System.out.println(compress(ch));
    }

}