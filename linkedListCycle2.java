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

public class linkedListCycle2 
{
  public ListNode detectCycle(ListNode head) 
  {
    if(head == null)
      return null;
        
    ListNode curr = head;
    ListNode prev = head;
    
    ListNode start = head;
    
    int count = 0;
    
    while(curr.next != null)
    {
      curr = curr.next;
      
      if(curr == prev)
      {
        while(prev != start)
        {
          curr = curr.next;
          
          if(start == curr)
            return start;
              
          else if(curr == prev)
            start = start.next;
              
          curr = curr.next;

          prev = prev.next;
        }
        
        return start;
      }
      
      if(curr.next != null)
        curr = curr.next;
  
      prev = prev.next;
    }
    
    return null;
  }
}