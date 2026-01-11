import java.util.*;
class Solution {
    public static List<String> letterCombinations(String digits) {
        //i
        if(digits.length()==0){
            return new ArrayList<>();
        }
        //add all string carsponding 
        Map<Character,String> map=new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        List<String> ans=new ArrayList<>();
        StringBuilder temp=new StringBuilder("");
        solve(0,digits,temp,ans,map);
        return ans;
    }
    public static void solve(int n,String digit,StringBuilder ans,List<String> temp,Map<Character,String> map){
        //kamm
        if(n==digit.length()){
            temp.add(ans.toString());
            return;
        }
        char ch=digit.charAt(n);
        String stringDigit=map.get(ch);
        for(int i=0;i<stringDigit.length();i++){
            ans.append(stringDigit.charAt(i));
            solve(n+1,digit,ans,temp,map);
            ans.deleteCharAt(ans.length()-1);
        }
    }
    public static void main(String arg[]){
        List<String> list=letterCombinations("23");
        for(String li:list){
            System.out.println(li);
        }
    }
}