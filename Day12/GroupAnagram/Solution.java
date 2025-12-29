import java.util.*;
class Solution {
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String str:strs){
            char ch[]=str.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String arg[]){
        String strs[]={"eat","tea","tan","ate","nat","bat"};
        List<List<String>> list=groupAnagrams(strs);

    }
}