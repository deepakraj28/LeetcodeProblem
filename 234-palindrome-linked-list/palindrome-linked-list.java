class Solution
{
    public boolean isPalindrome(ListNode head)
    {
       // ListNode temp=head;
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
       ListNode p=slow;
       ListNode q=null;
       ListNode r=null;
        while(p!=null)
        {
            r=q;
            q=p;
            p=p.next;
            q.next=r;
        }
      //  temp=head;
   
        while(q!=null)
        {
            if(head.val==q.val)
            {
                q=q.next;
                head=head.next;
            }
            else
            {
                return false;
            }
        }
    return true;
    }
}