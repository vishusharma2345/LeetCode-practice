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
    public ListNode middleNode(ListNode head) {
       List<ListNode> l=new ArrayList<>();
       ListNode tmp=head;
       while(tmp!=null){
        l.add(tmp);
        tmp=tmp.next;
       }
       int in=l.size()/2;
       return l.get(in);
    }
}