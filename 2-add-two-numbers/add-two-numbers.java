class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        ListNode dummy = new ListNode(-1); 
        ListNode curr = dummy;  
        int carry = 0;
        while(l1!=null || l2!=null)
        {
            int digit1=0,digit2=0;
            if(l1!=null)
            digit1 = l1.val;  //
            if(l2!=null)
            digit2 = l2.val;  
            int rem=(digit1+digit2+carry)%10; 
            ListNode temp = new ListNode(rem); 
            carry = (digit1+digit2+carry)/10; 
            curr.next = temp;  
            curr = curr.next;
            if(l1!=null)
            l1 = l1.next; 
            if(l2!=null)
            l2 = l2.next;
        }  
        if(carry==1) 
        {
            curr.next = new ListNode(carry);
        }
        return dummy.next;
    } 
}