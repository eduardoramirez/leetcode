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

public class binaryTreeInorderTraversal
{    
  public ArrayList<Integer> inorderTraversal(TreeNode root) 
  {
    ArrayList<Integer> vals = new ArrayList<Integer>();
    
    if(root == null)
      return vals;
        
    Stack<TreeNode> st = new Stack<TreeNode>();
    
    st.push(root);
    
    TreeNode ptr = root;
    
    boolean vis = false;
    
    while(!st.empty())
    {
      while(ptr.left != null && vis == false)
      {
        ptr = ptr.left;
        st.push(ptr);
      }
      
      vals.add(ptr.val);
      
      st.pop();
      
      if(ptr.right != null)
      {
        ptr = ptr.right;
        st.push(ptr);
        vis = false;
        continue;
      }
      
      if(st.size() != 0)
        ptr = st.peek();
          
      vis = true;
    }
    
    return vals;
  }
}