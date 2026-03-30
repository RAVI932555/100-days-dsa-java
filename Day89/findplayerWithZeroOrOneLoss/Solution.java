class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<matches.length;i++){
            map.put(matches[i][1],map.getOrDefault(matches[i][1],0)+1);
        }
        List<List<Integer>> ans=new ArrayList<>();
        Set<Integer> list=new HashSet<>();
        for(int i=0;i<matches.length;i++){
            if(!map.containsKey(matches[i][0])){
                list.add(matches[i][0]);
            }   
        }
        
        List<Integer> l=new ArrayList<>(list);
        Collections.sort(l);
        ans.add(l);
        l=new ArrayList<>();
        Set<Integer> set=map.keySet();
        for(int i:set){
            if(map.get(i)<2){
                l.add(i);
            }
        }
        Collections.sort(l);
        ans.add(l);
        return ans;
    }
}