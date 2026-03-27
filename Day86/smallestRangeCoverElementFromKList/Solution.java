import java.util.*;
class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        int k=nums.size();

        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)-> a[0]-b[0]);
        int range[]={-1000000,1000000};
        int maxElement=Integer.MIN_VALUE;

        for(int i=0;i<k;i++){
            int element=nums.get(i).get(0);
            int listIdx=i;
            int idx=0;
            pq.add(new int[]{element,listIdx,idx});
            maxElement=Math.max(maxElement,element);
        }

        while(!pq.isEmpty()){

            int arr[]=pq.remove();
            int element=arr[0];
            int listIdx=arr[1];
            int idx=arr[2];

            if(maxElement-element<range[1]-range[0]){
                range[0]=element;
                range[1]=maxElement;
            }

            int nextIdx=idx+1;
            if(nextIdx<nums.get(listIdx).size()){
                int ele=nums.get(listIdx).get(nextIdx);
                pq.add(new int[]{ele,listIdx,nextIdx});
                maxElement=Math.max(ele,maxElement);
            }else{
                break;
            }
        }
        return range;
    }
}