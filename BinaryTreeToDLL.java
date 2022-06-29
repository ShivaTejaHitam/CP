class Solution
{
    static Node prev=null;
    static Node next=null;
    
    static void helper(Node root)
    {
        if(root!=null)
        {
            helper(root.left);
            root.left=prev;
            prev=root;
            helper(root.right);
        }
    }
    
    
    Node bToDLL(Node root)
    {
	    prev=null;
	    next=null;
	    
	    helper(root);
	    
	    
	    Node head=root;
	    
	    while(prev!=null)
	    {
	        prev.right=next;
	        next=prev;
	        prev=prev.left;
	    }
	    
	    return next;
    }
    
}
