import java.util.*;
class Solution {
    public static int residuePrefixes(String s) {
        boolean ch[]=new boolean[26];
        int distanct=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            char cha=s.charAt(i);
            if(!ch[cha-'a']){
                ch[cha-'a']=true;
                distanct++;
            }
            int len=i+1;
            if(distanct==len%3){
                count++;
            }
        }
        return count;
    }
    public static void main(String arg[]){
        System.out.println(residuePrefixes("dddd"));
    }
}