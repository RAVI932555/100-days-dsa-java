class Solution {
    public boolean hasAllCodes(String s, int k) {
        Set<String> list=new HashSet<>();
        int count=1<<k;
        for(int i=k;i<=s.length();i++){
            String str=s.substring(i-k,i);
            if(!list.contains(str)){
                list.add(str);
                count--;
            }
            if(count==0){
                return true;
            }
        }
        return false;
    }
}