package leetcode_148;

public class Solution {
     public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    public ListNode sortList(ListNode head) {
       Solution solution = new Solution();
       solution.toSort(head);
       return head;
    }

    public void toSort(ListNode head){
        ListNode current = head;
        ListNode index = null;
        int temp;

        if(head == null){ return;}
        else {
            while (current != null){
                index = current.next;
                while (index != null){
                    if(current.val > index.val){
                        temp = current.val;
                        current.val = index.val;
                        index.val = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {

    }
}
