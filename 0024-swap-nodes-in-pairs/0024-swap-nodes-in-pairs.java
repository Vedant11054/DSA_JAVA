class Solution {
    public ListNode swapPairs(ListNode head) {

        ListNode head1 = new ListNode(0);
        head1.next = head;
        ListNode prev = head1;
        while (prev.next != null && prev.next.next != null) {
            ListNode first = prev.next;
            ListNode second = first.next;
            first.next = second.next;
            second.next = first;
            prev.next = second;
            prev = first;
        }

        return head1.next;
    }
}