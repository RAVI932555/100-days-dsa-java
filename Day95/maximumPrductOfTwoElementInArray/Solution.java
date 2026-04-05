class Solution {
    public int maxProduct(int[] nums) {
       PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)-> b-a);
       for(int i=0;i<nums.length;i++){
        pq.add(nums[i]);
       }
       int first=pq.remove();
       int second=pq.remove();
       return (first-1)*(second-1);
    }
}