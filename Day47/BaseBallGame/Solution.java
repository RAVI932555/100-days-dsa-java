package Day47.BaseBallGame;

import java.util.Stack;

class Solution {
    public static int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("+")){
                int first=st.pop();
                int second=st.pop();
                st.push(second);
                  st.push(first);
                st.push(first+second);
            }else if(operations[i].equals("D")){
                int first=st.pop();
                st.push(first);
                System.out.println(first*2);
                st.push(first*2);

            }else if(operations[i].equals("C")){
                st.pop();
            }else{
                st.push(Integer.parseInt(operations[i]));
            }
        }
        int sum=0;
        while(!st.isEmpty()){
            System.out.println(st.peek());
            sum+=st.pop();
        }
        return sum;
    }
    public static void main(String arg[]){
        String opeations[]={"5","-2","4","C","D","9","+","+"};
        System.out.println(calPoints(opeations));
    }
}
