import java.util.*;
class MedianFinder {
    PriorityQueue<Integer> maxpq;
    PriorityQueue<Integer> minpq;
    public MedianFinder() {
        maxpq=new PriorityQueue<>(Collections.reverseOrder());
        minpq=new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        if(maxpq.isEmpty() || num<maxpq.peek()){
            maxpq.add(num);
        }else{
            minpq.add(num);
        }
        //balanced the elment size

        if(maxpq.size()-minpq.size()>1){
            minpq.add(maxpq.peek());
            maxpq.remove();
        }else if(maxpq.size()<minpq.size()){
            maxpq.add(minpq.peek());
            minpq.remove();
        }
    }
    
    public double findMedian() {
        if(maxpq.size()==minpq.size()){
            double mean=(double)(maxpq.peek()+minpq.peek())/2;
            return mean;
        }else{
            return maxpq.peek();
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */