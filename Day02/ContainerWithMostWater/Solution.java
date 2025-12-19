class Solution {
    public static int maxArea(int[] height) {
        int ans=0;
        int start=0;
        int end=height.length-1;
        while(start<end){
            int waterTrapped=Math.min(height[start],height[end])*(end-start);
            ans=Math.max(ans,waterTrapped);
            if(height[start]<height[end]){
                start++;
            }else{
                end--;
            }
        }
        return ans;
    }
    public static void main(String arg[]){
        int []height={1,6,7,4,3,7,5,5,8};
        System.out.println(maxArea(height));
    }
}