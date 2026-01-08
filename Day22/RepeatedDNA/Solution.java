import java.util.*;
class Solution {
    public static List<String> findRepeatedDnaSequences(String s) {
        List<String> list=new ArrayList<>();
        if(s.length()<10){
            return list;
        }
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<=s.length()-10;i++){
            String str=s.substring(i,i+10);
            map.put(str,map.getOrDefault(str,0)+1);
        }
        for(String key:map.keySet()){
            if(map.get(key)>1){
                list.add(key);
            }
        }
        return list;
    }
    public static void main(String arg[]){
        List<String> list=findRepeatedDnaSequences("AAAAAAccccccccccAAAAAAAcccccccccAAAAAA");
        for(String str:list){
            System.out.println(str);
        }
    }
}