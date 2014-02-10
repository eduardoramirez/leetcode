public class climbingStairs 
{
  public int climbStairs(int n) 
  {
    if(n == 0 || n == 1 || n == 2)
      return n;
    
    int a = 0;
    int b = 1;
    int c = 2;
    
    for(int i = 2; i < n; i++)
    {
      a = b;
      b = c;
      c += a;
    }
        
    return c;
  }
}