public class reverseWordsInString {
  public String reverseWords(String s) {
    String[] sepS = s.split(" +");
    
    String reverseS = "";
    
    for(int i = sepS.length - 1; i >= 0; i--){
      reverseS += sepS[i] + " ";
    }
        
    return reverseS.trim();
  }
}