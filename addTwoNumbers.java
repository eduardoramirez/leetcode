/**
 * Definition for singly-linked list.
 */
class ListNode 
{
    int val;
    ListNode next;
    ListNode(int x) 
    {
      val = x;
      next = null;
    }
}

public class addTwoNumbers
{
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
  {
    Stack<Integer> st1 = new Stack<Integer>();
    Stack<Integer> st2 = new Stack<Integer>();
  
    ListNode ptr = l1;
  
    while(ptr != null)
    {
      st1.push(ptr.val);
      ptr = ptr.next;
    }
  
    ptr = l2;
  
    while(ptr != null)
    {
      st2.push(ptr.val);
      ptr = ptr.next;
    }
  
    long n1 = 0;
    while(!st1.empty())
      n1 = (long)((n1*10) + st1.pop());
  
    long n2 = 0;
    while(!st2.empty())
      n2 = (long)((n2*10) + st2.pop());
  
    long sum = n1+n2;
  
    if(sum == 0)
      return new ListNode(0);
  
    ListNode suml = new ListNode((int)(sum % 10));
    ListNode curr = suml;

    sum = sum/10;
  
    while(sum > 0)
    {
      ListNode temp = new ListNode((int)(sum % 10));  
      curr.next = temp;
      curr = curr.next;
      sum = sum/10;
    }
  
    return suml;
  }
}