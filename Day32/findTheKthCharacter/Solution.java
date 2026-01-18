class Solution {
    public static char kthCharacter(int k) {
        String str="a";
        while(str.length()<k){
            int n=str.length();
            for(int i=0;i<n;i++){
                char ch=str.charAt(i)=='z' ? 'a':(char)(str.charAt(i)+1);
                str+=ch;
            }
        }
        return str.charAt(k-1);
    }
    public static void main(String arg[]){
        System.out.println(kthCharacter(3));
    }
}