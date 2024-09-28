/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution
{
    public ListNode doubleIt(ListNode head)
    {
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null)
        {
            int pro=curr.val*2;
            if(pro>=10&&curr==head)
            {
                ListNode temp=new ListNode(1);
                temp.next=head;
                head=temp;
                curr.val=pro%10;
            }
            else
            {
                if(pro>=10)
                {
                  prev.val+=1;
                }
               curr.val=pro%10; 
            }
            prev=curr;
            curr=curr.next;
        }
        return head;
    }
}