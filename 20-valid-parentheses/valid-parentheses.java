class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        if(s.length()==1){
            return false;
        }
        char ch=s.charAt(0);
        if(ch==')'||ch==']'||ch=='}'){
                return false;
            }
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            
            if(c=='('||c=='['||c=='{'){
                    st.push(c);
            }
            else if(c==')'&&!st.empty()){
                if(st.peek()=='(')
                    st.pop();
                else
                    st.push(c);
            }
            else if(c==']'&&!st.empty()){
                if(st.peek()=='[')
                    st.pop();
                else
                    st.push(c);
            }
            else if(c=='}'&&!st.empty()){
                if(st.peek()=='{')
                    st.pop();
                else
                    st.push(c);
            }
            else
                st.push(c);
        }
        if(st.empty()){
            return true;
        }
        else{
            return false;
        }
    }
}