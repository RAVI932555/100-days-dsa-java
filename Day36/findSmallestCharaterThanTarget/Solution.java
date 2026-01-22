class Solution {
    public static char nextGreatestLetter(char[] letters, char target) {
        if(letters[letters.length-1]<=target){
            return letters[0];
        }
        int left=0;
        int right=letters.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(letters[mid]!=target && letters[mid]>target){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        return letters[right]==target && right<letters.length-1?letters[right+1]:letters[right];
    }
    public static void main(String arg[]){
        System.out.println(nextGreatestLetter(new char[]{'a','f','g'},'a'));
    }
}