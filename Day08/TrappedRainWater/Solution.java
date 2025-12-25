class Solution {
    public static int trap(int[] height) {
        if(height.length<=2) return 0;
        int left=0;
        int right=height.length-1;
        int leftmax=height[0];
        int rightmax=height[height.length-1];
        int ans=0;
        while(left<right){
            if(leftmax<rightmax){
                left++;
                leftmax=Math.max(leftmax,height[left]);
                ans+=leftmax-height[left];
            }else{
                right--;
                rightmax=Math.max(rightmax,height[right]);
                ans+=rightmax-height[right];
            }
        }
        return ans;
    }
     public static void main(String arg[]){
        int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
     }

}