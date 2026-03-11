class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q=new PriorityQueue<>();
        for(int i:nums){
            q.add(i);
        }
        int arr=nums.length-k;
        for(int i=0;i<arr;i++){
            q.remove();
        }
        return q.peek();
    }
}