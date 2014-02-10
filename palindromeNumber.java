public class palindromeNumber
{    
  public static int numDig(long n)
  {
    int num = 0;
  
    do{
      num++;
      
      n = n/10;
    } while(n > 0);
  
    return num;
  }
    
  public static int firstDig(long n, int numD)
  {
    double ret = n/(Math.pow(10,numD-1));
    return (int)ret;
  }
    
  public static int lastDig(long n)
  {
    return (int)(n%10);
  }
    
  public boolean isPalindrome(int x) 
  {   
    long x2 = (long)x;
    if(x2 < 0)
      return false;
    
    int numD = numDig(x2);
    int numD2 = 0;
    int fDig =  0;
    int lDig = 0;
    int missing = 0;
    boolean misN = false;
    
    if(numD == 1)
      return true;
    
    for(int i = 0; i < numD; i++)
    {
      numD2 = numDig(x2);
      fDig =  firstDig(x2, numD2);
      lDig = lastDig(x2);
      
      if(misN && missing != 0)
          fDig -= 1;
      
      if(fDig != lDig)
          return false;
      
      if(misN && missing != 0)
      {
        x2 = (int) (x2 - (Math.pow(10,numD2-1) * (fDig+1)));
        missing--;
      }
      else
        x2 = (int) (x2 - (Math.pow(10,numD2-1) * fDig));
      
      if(numDig(x2) == 1)
        return true;
      
      if(numDig(x2) != numD2 - 1)
      {
          misN = true;
          
          missing = ((numD2-1) - numDig(x2));
          
          for(int j = 1; j <= missing; j++)
              x2 =(int) (x2 + (Math.pow(10,numD2-1-j)));
      }
      
      x2 = x2/10;
    }
    
    return true;
  }
}