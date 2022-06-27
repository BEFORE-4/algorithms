package leetcode;

public class Solution86 {
    public static void main(String[] args) {
        int[] arr = {1,4,3,2,5,2};
        ListNode node =  ListNode.createList(arr);
        node = partition(node, 3);
        while(node!=null){
            System.out.println(node.val);
            node = node.next;
        }
        
    }
    public static ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode();
        ListNode big = new ListNode();//两个哑节点
        ListNode s =small,b=big;//定义两个指针节点
        while(head != null){
            if(head.val < x){
                s.next = head;
                s = s.next;
            }else{
                b.next = head;
                b = b.next;
            }
            head = head.next;
        }
        s.next = big.next;
        b.next = null;
        return small.next;
    }
}
