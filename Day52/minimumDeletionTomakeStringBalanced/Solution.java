package Day52.minimumDeletionTomakeStringBalanced;
import java.util.*;
class Solution {
    public static int minimumDeletions(String s) {
        Stack<Character> st=new Stack<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty() && s.charAt(i)=='a' && st.peek()=='b'){
                st.pop();
                count++;
            }else{
                st.push(s.charAt(i));
            }
        }
        return count;
    }
    public static void main(String arg[]){
        System.out.println(minimumDeletions("aababbab"));
    }
}