public class reverseWordsInString {
  public static String reverseWords(String s) {
    String[] sepS = s.split(" +");
    
    String reverseS = "";
    
    for(int i = sepS.length - 1; i >= 0; i--){
      reverseS += sepS[i] + " ";
    }
        
    return reverseS.trim();
  }

  public static void main (String [] args){
    String original = "  a  b";

    String reversed = reverseWords(original);

    System.out.println(original);
    System.out.println(reversed); 
  }
}