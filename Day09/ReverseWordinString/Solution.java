import java.util.*;
class Solution {
    private static boolean isAlphabitic(char ch){
        return (ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>='0' && ch<='9');
    }
    public static String reverseWords(String s) {
        //find the first character in string at right size
        int index=s.length()-1;
        StringBuilder st=new StringBuilder("");
        int start=index;
        while(index>=0){
            if(isAlphabitic(s.charAt(index))){
                int changed=start;
                start=index;
                while(index>=0 && isAlphabitic(s.charAt(index))) index--;
                st.append(s.substring(index+1,start+1)+" ");
            }else{
                index--;
            } 
        }
        st.deleteCharAt(st.length() - 1);
        return st.toString();
    }
    public static void main(String arg[]){
        System.out.println(reverseWords("the sky is blue"));
    }
}