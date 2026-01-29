class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st=new Stack<>();
        int nextGreater[]=new int[nums2.length];
        int result[]=new int[nums1.length];
        for(int i=nums2.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<nums2[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nextGreater[i]=-1;
            }else{
                nextGreater[i]=st.peek();
            }
            st.push(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            int j=0;
            while(nums1[i]!=nums2[j]){
                j++;
            }
            result[i]=nextGreater[j];
        }
        return result;
    }
}