package leetcode_21;

public class Solution {
    ListNode listNode = new ListNode();
    ListNode temp = listNode;
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null){
            return null;
        }
        while (true) {

            if (list1 == null) {
                temp.next = list2;
                break;
            }
            if (list2 == null) {
                temp.next = list1;
                 break;
            }

            if(list1.val < list2.val){
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;

            }
            temp = temp.next;
        }

        return listNode.next;

    }

}
