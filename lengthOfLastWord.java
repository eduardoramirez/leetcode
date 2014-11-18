public class lengthOfLastWord {
  public int lengthOfLastWord(String s) {
    s = s.trim();
    if(s.equals(""))
      return 0;

    int length = s.length();
    int begin = 0;
    char tmp;
    boolean found = false;
    int i;
    for(i = 0; i < length; i++) {
      tmp = s.charAt(i);

      if(tmp == ' ') {
        found = false;
        continue;
      }
      else {
        if(!found) {
          begin = i;
          found = true;
        }
      }
    }

    return s.substring(begin, i).length();
  }
}