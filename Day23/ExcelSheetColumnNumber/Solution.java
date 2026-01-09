class Solution {
    public static int titleToNumber(String columnTitle) {
        int ans=0;
        for(char ch:columnTitle.toCharArray()){
            int val=ch-'A'+1;
            ans=ans*26+val;
        }
        return ans;
    }
    public static void main(String arg[]){
        System.out.println(titleToNumber("AB"));
    }
}