class Solution {
    public static String convert(String s, int numRows) {
        if(numRows==1) return s;
        StringBuilder st=new StringBuilder("");
        for(int i=0;i<numRows;i++){
            for(int j=i;j<s.length();j+=(2*(numRows-1))){
                st.append(s.charAt(j));
                if(i>0 && i<numRows-1 && j+(2*(numRows-1))-(2*i)<s.length()){
                    st.append(s.charAt(j+(2*(numRows-1))-(2*i)));
                }
            }
        }
        return st.toString();
    }
    public static void main(String arg[]){
        System.out.println(convert("PAYPALISHIRING",3));
    }
}