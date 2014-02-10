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

public class linkedListCycle
{
  public boolean hasCycle(ListNode head) 
  {
    if(head == null)
      return false;
        
    ListNode curr = head;
    ListNode prev = head;
    
    while(curr.next != null)
    {
      curr = curr.next;
      
      if(curr == prev)
        return true;
      
      if(curr.next != null)
        curr = curr.next;
  
      prev = prev.next;
    }
    
    return false;
  }
}