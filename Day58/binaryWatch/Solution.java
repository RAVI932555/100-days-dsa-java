package Day58.binaryWatch;

class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> list=new ArrayList<>();
        for(int hh=0;hh<12;hh++){
            for(int mm=0;mm<60;mm++){
                if(binaryCount(hh)+binaryCount(mm)==turnedOn){
                    String hour=String.valueOf(hh);
                    String minute=(mm<10? "0"+String.valueOf(mm):String.valueOf(mm));
                    list.add(hour+":"+minute);
                }
            }
        }
        return list;
    }
    public int binaryCount(int n){
        int count=0;
        while(n>0){
            int number=n;
            if((number&1) !=0){
                count++;
            }
            System.out.println(count);
            n=n>>1;
        }
        return count;
    }
}
