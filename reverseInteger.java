public class reverseInteger
{
  public int reverse(int x) {
    if(x == 0)
      return 0;
        
    boolean neg = false;
    
    if(x < 0)
      neg = true;
    
    x = Math.abs(x);    
    ArrayList<Integer> st = new ArrayList<Integer>();
    
    while(x > 0)
    {
      st.add(x % 10);
      
      x = x/10;
    }
     
    int rev = 0;
    
    while(st.size() != 0)
      rev = (rev*10) + st.remove(0);
        
    if(neg)
      return -rev;
        
    return rev;
  }
}