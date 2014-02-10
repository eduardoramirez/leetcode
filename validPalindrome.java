public class validPalindrome
{
  public boolean isPalindrome(String s) 
  {
    if(s.equals(""))
      return true;
        
    s = s.replaceAll("[^a-zA-Z0-9\\s]", "");
    s = s.trim();
    s = s.toLowerCase();
    s = s.replaceAll("\\s+","");
    
    char[] str = s.toCharArray();
    
    for(int i = 0; i < str.length/2; i++)
    {
      if(str[i] != str[str.length - 1 - i])
        return false;
    }
    
    return true;
  }
}