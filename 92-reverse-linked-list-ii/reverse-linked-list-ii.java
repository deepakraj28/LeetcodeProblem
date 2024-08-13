class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head==null||left==right)
        {
          return head;
        } 
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode temp=dummy;
        
        for (int i=0;i<left-1;i++) {
            temp=temp.next;
        }
        
        ListNode t1=temp.next;
        
        for (int i=0;i<right-left;i++) {
            ListNode t2=t1.next;
            t1.next=t2.next;
            t2.next=temp.next;
            temp.next=t2;
        }
        
        return dummy.next;
    }
}