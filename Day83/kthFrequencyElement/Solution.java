class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        int arr[]=new int[k];
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int curr=nums[i];
            int count=0;
            while(i<nums.length && nums[i]==curr){
                i++;
                count++;
            }
            pq.add(new Pair(curr,count));
            i--;
        }
        for(int i=0;i<k;i++){
            arr[i]=pq.remove().num;
        }
        return arr;
    }
    static class Pair implements Comparable<Pair> {
        int num;
        int freq;
        public Pair(int num,int freq){
            this.num=num;
            this.freq=freq;
        }
        public int compareTo(Pair p1){
            return p1.freq-this.freq; 
        }
    }
}