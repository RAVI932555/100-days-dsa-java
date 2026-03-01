class Solution {
    public int minPartitions(String n) {
        int largest=0;
        for(int i=0;i<n.length();i++){
            int digit=n.charAt(i)-'0';
            largest=Math.max(largest,digit);
        }
        return largest;
    }
}
