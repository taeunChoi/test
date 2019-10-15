class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;
        ListNode resHead = head.next;
        
        ListNode p1 = head;
        ListNode p2 = head.next;
        while(p2 != null) {
            // 짝홀처리
            p1.next = p2.next == null? null :(p2.next.next==null? p2.next: (p2.next.next));
            //swap
            ListNode tmp = p2.next;
            p2.next = p1;
            p1 = tmp;
            p2 = tmp == null? null: tmp.next;   
        }
        
        
        return resHead;
    }
}
