import java.util.*;

class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < operations.length; i++) {

            String op = operations[i];

            if(op.equals("C")) {
                st.pop();
            }
            else if(op.equals("D")) {
                st.push(2 * st.peek());
            }
            else if(op.equals("+")) {
                int a = st.pop();
                int b = st.peek();

                st.push(a);
                st.push(a + b);
            }
            else {
                st.push(Integer.parseInt(op));
            }
        }

        int sum = 0;

        while(!st.isEmpty()) {
            sum += st.pop();
        }

        return sum;
    }
}