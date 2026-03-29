class Solution {
    public boolean canBeEqual(String s1, String s2) {
        if(s1.equals(s2)){
            return true;
        }
        char temp[]=s1.toCharArray();
        for(int i=0;i<s1.length()-2;i++){
            if(temp[i]!=s2.charAt(i) && s2.charAt(i)==temp[i+2]){
                char ch=temp[i];
                temp[i]=temp[i+2];
                temp[i+2]=ch;
            }
        }   
        s1=new String(temp);
        if(s1.equals(s2)){
            return true;
        }else{
            return false;
        }
    }
}