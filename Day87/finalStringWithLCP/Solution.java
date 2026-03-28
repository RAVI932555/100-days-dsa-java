class Solution {
    public String findTheString(int[][] lcp) {
        int n=lcp.length;
        char word[]=new char[n];
        for(int i=0;i<n;i++){
            word[i]='$';
        }

        for(int i=0;i<n;i++){

            // word[i] which char i can add
            for(int j=0;j<i;j++){
                if(lcp[j][i]!=0){
                    word[i]=word[j];
                    break;
                }
            }

            if(word[i]=='$'){

             /// check which char is best for ith 
                boolean forbid[]=new boolean[26];
                for(int idx=0;idx<i;idx++){
                    if(lcp[idx][i]==0){
                        forbid[word[idx]-'a']=true;
                    }
                }

                for(int j=0;j<26;j++){
                    if(forbid[j]==false){
                        word[i]=(char)(j+'a');
                        break;
                    }
                }
            }
             if(word[i]=='$'){
                    return "";
            }
           
        }
         if(checkLCP(word,lcp)){
                String str=new String(word);
                return str;
            }else{
                return "";
            }
    }
    public boolean checkLCP(char word[],int lcp[][]){
        int n=lcp.length;
        int temp[][]=new int[n][n];
        // fill the last column
        for(int i=0;i<n;i++){
            if(word[i]==word[n-1]){
                temp[i][n-1]=1;
            }else{
                temp[i][n-1]=0;
            }
        }

        for(int j=0;j<n;j++){
            if(word[j]==word[n-1]){
                temp[n-1][j]=1;
            }else{
                temp[n-1][j]=0;
            }
        }

        for(int i=n-2;i>=0;i--){
            for(int j=n-2;j>=0;j--){
                if(word[i]==word[j]){
                    temp[i][j]=1+temp[i+1][j+1];
                }else{
                    temp[i][j]=0;
                }
            }
        }

        // comparing
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(temp[i][j]!=lcp[i][j]){
                    return false;
                }
            } 
        }
        return true;
    }
}
