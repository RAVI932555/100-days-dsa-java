class Solution {
    public static void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;
        while(i<j){
            char ch=s[i];
            s[i]=s[j];
            s[j]=ch;
            i++;
            j--;
        }
    }
    public static void main(String arg[]){
        reverseString(new char[]{'h','e','l','l','o'});
    }
}