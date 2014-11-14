public class mergeSortedArray {
  public static void merge(int A[], int m, int B[], int n) {
    if(n == 0 || A.length < n+m)
      return; 

    int newLength = m + n;

    if(m == 0) {
      for(int i = 0; i < B.length; i++)
        A[i] = B[i];
      
      return;
    }

    n--;
    m--;
    while (newLength > 0) {

      if(n < 0){
        A[--newLength] = A[m--];
      }
      else if(m < 0){
        A[--newLength] = B[n--];
      }
      else if (B[n] >= A[m]) {
        A[--newLength] = B[n--];
      } 
      else {
        A[--newLength] = A[m--];
      }
    }
  }

  public static void main (String [] args) {
    int[] a1 = new int[2];
    int[] a2 = new int[1];

    a1[0] = 2;
    a2[0] = 1; 

    merge(a1, 1, a2, 1);

    for(int i = 0; i < a1.length; i++)
      System.out.println(a1[i]);
  }
}