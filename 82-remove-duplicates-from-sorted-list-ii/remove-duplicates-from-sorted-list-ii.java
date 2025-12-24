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
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        HashMap<Integer,Integer> map=new HashMap<>();
        ListNode curr=head;
        ListNode dummy=new ListNode(0);
        ListNode tail=dummy;
        while(curr!=null){
            map.put(curr.val,map.getOrDefault(curr.val,0)+1);
            curr=curr.next;
        }
       ListNode curr1=head;
        while(curr1!=null){
            if(map.get(curr1.val)==1){
                tail.next=new ListNode(curr1.val);
                tail=tail.next;
            }
           curr1= curr1.next;
        }
        return dummy.next;
    }
}