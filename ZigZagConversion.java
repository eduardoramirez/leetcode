import java.util.*;

public class ZigZagConversion {
  public static String convert(String s, int nRows) {
    if(nRows == 1)
      return s;

    int length = s.length();
    String converted = "";
    ArrayList<String> subs = new ArrayList<String>();

    int i = 0;
    while(i < length){
      if(i % 2 == 0){
        if(i + nRows > length){
          subs.add(s.substring(i));
        }
        else{
          subs.add(s.substring(i, i+nRows));
        }
        i += nRows;
      }
      else{
        subs.add(s.substring(i, i+1));
        i++;
      }
    }

    int mid = (nRows % 2 == 0) ? nRows/2 : (nRows/2) + 1;
    int row = 1;
    boolean beforeMid = true;
    i=0;

    length = subs.size();
    String tmp;

    while(row-1 != nRows && !subs.isEmpty()){
      if(i == length){
        row++;
        i = 0;
      }

      if(row > mid || s.length)
        beforeMid = false;

      tmp = subs.remove(0);

      System.out.println("took out: " + tmp);

      if (i % 2 != 0 && row == mid && beforeMid){
        converted += String.valueOf(tmp.charAt(0));
        i++;
        continue;
      }
      else if(i % 2 != 0 && beforeMid){
        subs.add(tmp);
        i++;
        continue;
      }

      converted += String.valueOf(tmp.charAt(0));

      if(tmp.length() != 1)
        subs.add(tmp.substring(1));

      i++;
    }

    System.out.println(subs.size());

    return converted;
  }

  public static void main (String [] args){
    String og = "ABCD";

    String mod = convert(og, 2);

    System.out.println(og);
    System.out.println(mod);
  }
}