class Solution {
    public static String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        //kaam
        String str=countAndSay(n-1);
        StringBuilder temp=new StringBuilder("");
        for(int i=0;i<str.length();i++){
            int count=1;
            char ch=str.charAt(i);
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            temp.append(count);
            temp.append(ch);
        }
        return temp.toString();
    }
    public static void main(String arg[]){
        System.out.println(countAndSay(4));
    }
}