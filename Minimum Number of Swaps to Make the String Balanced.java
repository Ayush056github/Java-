//  1963-- Minimum Number of Swaps to Make the String Balanced 
class Solution {
    public int minSwaps(String s) {
        Stack<Character> st =  new Stack<>();
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='['){
                st.push(ch);
            }else{
                if(st.isEmpty() || st.peek()==']'){
                    st.push(ch);
                }else{
                    st.pop();
                }
            }
        }
        int total = st.size();
        int closed = total/2;
        return (closed+1)/2;
        
    }
}
