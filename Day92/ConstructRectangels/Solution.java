class Solution {
    public int[] constructRectangle(int area) {
    
        int diff=area-1;
        int arr[]={area,1};
        for(int i=2;i<=Math.sqrt(area);i++){
            if(area%i==0){
                if(diff>(Math.abs(i-(area/i)))){
                    
                    arr[0]=i>(area/i)?i:area/i;
                    arr[1]=i<(area/i)?i:area/i;
                }
            }
        }
        return arr;
    }
}