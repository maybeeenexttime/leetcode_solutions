package leetcode_206;


  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }


class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode temp = null;
        ListNode currentNext = null;
       while (head != null){
           temp = head.next;
           head.next = currentNext;
           currentNext = head;
           head = temp;
       }

        return currentNext;
    }

}