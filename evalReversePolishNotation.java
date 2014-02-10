public class evalReversePolishNotation {
  public int evalRPN(String[] tokens) 
  {
    Stack<Integer> st = new Stack<Integer>();
    
    st.push(Integer.parseInt(tokens[0]));
    
    int temp1;
    int temp2;
    
    for(int i = 1; i < tokens.length; i++)
    {
      if(tokens[i].equals("+"))
      {
        temp1 = st.pop();
        temp2 = st.pop();
        
        st.push(temp2 + temp1);
      }
      else if(tokens[i].equals("-"))
      {
        temp1 = st.pop();
        temp2 = st.pop();
        
        st.push(temp2 - temp1);
      }
      else if(tokens[i].equals("/"))
      {
        temp1 = st.pop();
        temp2 = st.pop();
        
        st.push(temp2 / temp1);
      }
      else if(tokens[i].equals("*"))
      {
        temp1 = st.pop();
        temp2 = st.pop();
        
        st.push(temp2 * temp1);
      }
      else
        st.push(Integer.parseInt(tokens[i]));
    }
    
    return st.pop();
  }
}