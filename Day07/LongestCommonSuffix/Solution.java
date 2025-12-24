class Solution {
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder st=new StringBuilder("");
        int index=0;
        for(int i=1;i<strs.length;i++){
            if(strs[index].length()>strs[i].length()){
                index=i;
            }
        }
        for(int i=0;i<strs[index].length();i++){
           char ch=strs[index].charAt(i);
            for(int j=0;j<strs.length;j++){
                if(strs[j].charAt(i)!=ch){
                    return st.toString();
                }
            }
            st.append(ch);
        }
        return st.toString();
    }
    public static void main(String arg[]){
        String strs[]={"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }

}