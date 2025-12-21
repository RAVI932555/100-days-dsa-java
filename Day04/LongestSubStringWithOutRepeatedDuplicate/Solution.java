import java.util.*;
class Solution {
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> list=new HashSet<>();
        int i=0;
        int largest=0;
        for(int j=0;j<s.length();j++){
            if(!list.contains(s.charAt(j))){
                list.add(s.charAt(j));
                largest=Math.max(largest,list.size());
            }else{
                while(s.charAt(i)!=s.charAt(j)){
                    list.remove(s.charAt(i));
                    i++;
                }
                list.remove(i);
                i++;
            }
        }
        return largest;
    }
     public static void main(String arg[]){
       String str="abcabcbb";
       System.out.println(lengthOfLongestSubstring(str));
    }

    
}