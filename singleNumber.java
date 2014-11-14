public class singleNumber {
  public int singleNumber(int[] A) {
    int value = 0;
    for (int i = 0; i < A.length; i++)
      value = value ^ A[i];
    return value;
  }
}