/**
 * Definition for binary tree
 */
class TreeNode 
{
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode(int x) 
  { 
    val = x; 
  }
}

public class sameTree
{
  private static boolean flag;
  
  public static void inOrder(TreeNode node1, TreeNode node2)
  {
    if(node1 == null && node2 == null)
        return;
    
    if((node1 == null && node2 != null) || (node1 != null && node2 == null))
    {
      flag = false;
      return;
    }
    
    if(flag == false)
      return;
        
    inOrder(node1.left, node2.left);
    
    if(node1.val != node2.val)
      flag = false;
        
    inOrder(node1.right, node2.right);
  }
  
  public boolean isSameTree(TreeNode p, TreeNode q) 
  {
    flag = true; 
        
    inOrder(p, q);
    
    return flag;
  }
}