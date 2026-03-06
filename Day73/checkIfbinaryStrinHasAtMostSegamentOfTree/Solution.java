class Solution {
    public boolean isValidSerialization(String preorder) {
       int slots=1;
       String str[]=preorder.split(",");
       
       for(String s:str){
        
            slots--; // consume slot
            
            if(slots < 0) return false;
            
            if(!s.equals("#")){
                slots += 2; // create 2 new slots
            }
        }
       
       return slots==0;
    }
}