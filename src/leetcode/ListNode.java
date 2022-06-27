package leetcode;
//链表节点类
public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
   static ListNode createList(int[] arr){
       ListNode list = new ListNode();
       if(arr.length == 0) 
            return list;
       ListNode cur = list;
       for(int i = 0; i < arr.length - 1; i++){
           cur.val = arr[i];
           ListNode node = new ListNode();
           cur.next = node;
           cur = node; 
       }
       cur.val = arr[arr.length-1];
       return list;
   }
}
