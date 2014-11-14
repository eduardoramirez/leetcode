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

public class removeDuplicatesFromSortedList2
{
  public ListNode deleteDuplicates(ListNode head) {
    if(head == null)
      return head;
    
    int temp = 0;
    
    ListNode cur = head;
    ListNode tptr;
    ListNode pptr;
    
    temp = cur.val;
    
    tptr = cur;

    cur = cur.next;

    pptr = null;

    while(cur != null)
    {
      if(temp == cur.val)
      {
        if(tptr == head) {
          head = cur.next;
          tptr.next = null;
          tptr = cur;
          cur = cur.next;
          tptr.next = null;
          tptr = null;
        }
        else if(cur == head)
        {
          head = cur.next;
          tptr = cur;
          cur = cur.next;
          tptr.next = null;
          tptr = null;
        }
        else{
          tptr = cur;
          cur = cur.next;
          pptr.next = cur;
          tptr.next = null;
          tptr = null;
        }
      }
      else
      {
        temp = cur.val;

        if(tptr != null)
          pptr = tptr;
        
        tptr = cur;
        cur = cur.next;
      }
    }
    
    return head;
  }
}