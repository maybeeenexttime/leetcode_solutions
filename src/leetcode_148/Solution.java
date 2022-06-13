package leetcode_148;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {

//     PriorityQueue<ListNode> queue = new PriorityQueue<>();


    public ListNode sortList(ListNode head) {

        PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(comparator);

        while (head != null){
            ListNode toAdd = head;
            head = head.next;
            toAdd.next = null;
            queue.add(toAdd);

        }
        ListNode result = new ListNode(-1000);
        ListNode dummy = new ListNode();
        dummy = result;
        while (!queue.isEmpty()){
            result.next = queue.poll();

            result = result.next;
        }


       return dummy.next;
    }

    public static Comparator<ListNode> comparator = new Comparator<ListNode>() {
        @Override
        public int compare(ListNode o1, ListNode o2) {
            return o1.val - o2.val;
        }
    };


    public static void main(String[] args) {
        ListNode first = new ListNode( -1);
        ListNode second = new ListNode(5);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(0);
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        Solution solution = new Solution();
        ListNode res = solution.sortList(first);
        while (res != null){
            System.out.println(res.val);
            res = res.next;
        }
    }
}


