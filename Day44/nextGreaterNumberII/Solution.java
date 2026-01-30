class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int length=nums.length;
        int ans[]=new int[length];
        
        for(int i=2*length-1;i>=0;i--){
            int current=nums[i%length];
            while(!st.isEmpty() && st.peek()<=current){
                st.pop();
            }
           if(i<length){
            ans[i]=st.isEmpty()?-1:st.peek();
           }
            st.push(current);
        }
        
        return ans;
    }
}