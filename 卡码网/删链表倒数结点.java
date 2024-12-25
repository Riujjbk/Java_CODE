package 卡码网;

public class 删链表倒数结点 {
    public static void main(String[] args){

    }
    //1.最普通的方法
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // 第一次循环：计算链表长度
        int length = 0;
        ListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }

        // 如果要删除的是头节点
        if (n == length) {
            return head.next;
        }

        // 第二次循环：找到倒数第N个节点的前一个节点
        current = head;
        for (int i = 1; i < length - n; i++) {
            current = current.next;
        }

        // 删除倒数第N个节点
        current.next = current.next.next;

        return head;
    }
    //2.双指针
    public ListNode removeNthFromEnd1(ListNode head, int n) {
        ListNode fast,slow;
        ListNode dummy = new ListNode();
        dummy.next = head;
        fast = dummy;
        slow = dummy;
        // 快指针先走n步
        for (int i = 0; i < n+1; i++) {
            fast = fast.next;
        }
        // 快慢指针同时移动，直到快指针到达链表末尾
        while (fast!=null){
            fast = fast.next;
            slow = slow.next;
        }
        // 慢指针的下一个节点即为要删除的节点
        slow.next = slow.next.next;
        // 返回新的头节点
        return dummy.next;
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
