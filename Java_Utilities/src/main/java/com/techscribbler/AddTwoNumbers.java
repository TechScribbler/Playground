package com.techscribbler;



public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum=0;
        int carry=0;
        ListNode temp=new ListNode(0);

        while(l1 !=null || l2!=null){
            if(l1!=null){
                sum =sum +l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum =sum +l2.val;
                l2=l2.next;
            }
            if(sum>9){
                carry = 1;
                sum = sum-10;
            }else{
                carry=0;
            }
            temp.next=new ListNode(sum);
            temp=new ListNode(sum);

        }
        if(carry>0){
            temp.next=new ListNode(carry);
        }
        return temp.next;
    }
}
  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

