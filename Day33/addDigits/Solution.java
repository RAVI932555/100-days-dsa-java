class Solution {
    public static int addDigits(int num) {
        if(num==0){
            return 0;
        }
        int count=0;
        while(num>9){
            int n=0;
            while(num>0){
                n+=(num%10);
                num/=10;
            }
            num=n;
            count++;
        }
        return num;
    }
    public static void main(String arg[]){
        System.out.println(addDigits(23));

    }
}