class Solution {
    public String removeDuplicateLetters(String s) {
        int indexer[]=new int[26];
        Arrays.fill(indexer,-1);
        boolean temp[]=new boolean[26];

        StringBuilder st=new StringBuilder();
        for(int i=0;i<s.length();i++){
            indexer[s.charAt(i)-'a']=i;
        }

        //
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(temp[ch-'a']){
                continue;
            }
            while(st.length()>0 && indexer[st.charAt(st.length()-1)-'a']>i && st.charAt(st.length()-1)>ch){
                temp[st.charAt(st.length()-1)-'a']=false;
                st.deleteCharAt(st.length()-1);

            }
            st.append(ch);
            temp[ch-'a']=true;

        }
        return st.toString();
    }
}