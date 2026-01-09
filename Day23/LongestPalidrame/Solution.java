import java.util.*;
class Solution {
    public static int longestPalindrome(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        boolean add=false;
        int ans=0;
        for(Character key:map.keySet()){
            if(add==false && map.get(key)%2!=0){
                ans+=map.get(key);
                add=true;
            }else{
                if(map.get(key)%2!=0){
                    ans+=map.get(key)-1;
                }else{
                    ans+=map.get(key);
                }
            }
        }
        return ans;
    }
    public static void main(String arg[]){
        System.out.println(longestPalindrome("abccccdd"));
    }
}