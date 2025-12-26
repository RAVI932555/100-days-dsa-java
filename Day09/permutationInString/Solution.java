import java.util.*;
class Solution {
    public static boolean checkInclusion(String s1, String s2) {
        int left=0;
        int right=0;
       char ch[]=new char[26];
       char ch1[]=new char[26];
       for(int i=0;i<s1.length();i++){
        ch[s1.charAt(i)-'a']++;
       }
       while(right<s2.length()){
        ch1[s2.charAt(right)-'a']++;
        if(right-left+1>s1.length()){
            ch1[s2.charAt(left)-'a']--;
            left++;
        }
        if(Arrays.equals(ch,ch1)){
            return true;
        }
        right++;
       }
       return false;
    }
    public static void main(String arg[]){
        System.out.println(checkInclusion("ab","ieabdfce"));
    }
    
}