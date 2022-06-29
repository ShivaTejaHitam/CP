class Solution
{
    static Node prev;
    static Node next;
    static void helper(Node root){
        if(root!=null){
            helper(root.left);
            root.left = prev;
            prev=root;
            helper(root.right);
        }
    }
    
    static Node bToDLL(Node root){
        
        prev = null;
        next = null;
        
        helper(root);
        
        Node head = root;
        
        while(prev!=null){
            prev.right = next;
            next = prev;
            prev = prev.left;
        }
        
        return next;
    }
    
    static Node mergeDLL(Node ll1,Node ll2){
        Node head = null;
        Node tail = null;
        
        while(ll1!=null && ll2!=null){
            if(ll1.data < ll2.data){
                if(head==null){
                    head = ll1;
                    tail = ll1;
                    ll1 = ll1.right;
                }
                else{
                    tail.right = ll1;
                    ll1.left = tail;
                    tail = ll1;
                    ll1 = ll1.right;
                }
            }
            else{
                if(head==null){
                    head=ll2;
                    tail = ll2;
                    ll2=ll2.right;
                }
                else{
                    tail.right = ll2;
                    ll2.left = tail;
                    tail = ll2;
                    ll2 = ll2.right;
                }
            }
            
        }
        
        while(ll1!=null){
            tail.right = ll1;
            ll1.left = tail;
            tail = ll1;
            ll1 = ll1.right;
        }
        
        while(ll2!=null){
            tail.right = ll2;
            ll2.left = tail;
            tail = ll2;
            ll2 = ll2.right;
        }
        return head;
    }
    
    public List<Integer> merge(Node root1,Node root2)
    {
        
        Node ll1 = bToDLL(root1);
        Node ll2 = bToDLL(root2);
        
        Node head = mergeDLL(ll1,ll2);
        
        List<Integer> answer = new ArrayList<>();
        
        for(;head!=null;head=head.right){
            answer.add(head.data);
        }
        
        return answer;
    }
}
