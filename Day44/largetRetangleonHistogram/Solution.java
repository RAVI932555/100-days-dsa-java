import java.util.*;
class Solution {
    public static int largestRectangleArea(int[] heights) {
        int nbl[]=new int[heights.length];
        Stack<Integer> st=new Stack<>();
        
        for(int i=0;i<heights.length;i++){
                while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    nbl[i]=-1;
                }else{
                    nbl[i]=st.peek();
                }
                st.push(i);
        }
        // right bounder
        int nbr[]=new int[heights.length];
        st=new Stack<>();
        for(int i=heights.length-1;i>=0;i--){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nbr[i]=heights.length;
    
            }else{
                nbr[i]=st.peek();
            }
            st.push(i);
        }
        int maxArea=0;
        for(int i=0;i<heights.length;i++){
            int width=nbr[i]-nbl[i]-1;
            maxArea=Math.max(maxArea,width*heights[i]);
        }
        return maxArea;
    }
    public static void main(String arg[]){
        int heights[]={2,1,5,6,2,3};
        System.out.println(largestRectangleArea(heights));
    }
}