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

public class removeDuplicatesFromSortedList
{
  public ListNode deleteDuplicates(ListNode head) {
    if(head == null)
      return head;
    
    int temp = 0;
    
    ListNode cur = head;
    ListNode tptr;
    
    temp = cur.val;
    
    tptr = cur;
    
    cur = cur.next;
    
    while(cur != null)
    {
      if(temp == cur.val)
      {
        tptr.next = cur.next;
        
        cur = cur.next;
      }
      else
      {
        temp = cur.val;
        tptr = cur;
        cur = cur.next;
      }
    }
    
    return head;
  }
}