class Solution {
    private static boolean isAlphanumeric(char ch){
        return (ch>='a' && ch<='z')|| (ch>='A' && ch<='Z') || (ch>='0' && ch<='9');
        
    }
    public static boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<right){
            while(left<right && !isAlphanumeric(s.charAt(left))) left++;
            while(left <right && !isAlphanumeric(s.charAt(right))) right--;
            if(left<right && Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String arg[]){
        String str="A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str));
    }
}