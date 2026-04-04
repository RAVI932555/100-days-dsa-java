class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        int l=encodedText.length();
        int col=l/rows;
        StringBuilder str=new StringBuilder("");
        for(int i=0;i<col;i++){
            for(int j=i;j<l;j+=(col+1)){
                str.append(encodedText.charAt(j));
            }
        }
        while(str.length()>0 && str.charAt(str.length()-1)==' '){
            str.deleteCharAt(str.length()-1);
        }
        return str.toString();
    }
    
}