import java.util.*;
class Solution {
    public static List<List<String>> partition(String s) {
        List<String> part=new ArrayList<>();
        List<List<String>> ans=new ArrayList<>();
        partgetString(s,part,ans);
        return ans;
    }
    public static void partgetString(String s,List<String> part,List<List<String>> ans){
        if(s.length()==0){
            ans.add(new ArrayList<>(part));
            return;
        }
        //kka
        for(int i=0;i<s.length();i++){
            String parts=s.substring(0,i+1);
            if(palidrame(parts)){
                part.add(parts);
                partgetString(s.substring(i+1),part,ans);
                part.remove(part.size()-1);
            }

        }
    }
    public  static boolean palidrame(String str){
        int l=0;
        int r=str.length()-1;
        while(l<r){
            if(str.charAt(l)!=str.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static void main(String arg[]){
        List<List<String>> ans=partition("abb");
    }
}