package com.techscribbler;

import com.tectscribbler.helper.ListNode;

import java.util.Arrays;

public class SingleLinkedListIsPalindrome {
    public static void main(String[] args) {
        ListNode head = buildListNode();
        SingleLinkedListIsPalindrome singleLinkedListIsPalindrome=new SingleLinkedListIsPalindrome();
        singleLinkedListIsPalindrome.isPalindrome(head);
    }

    private static ListNode buildListNode() {
        ListNode head = new ListNode(1);
        ListNode second = addNode(head,2);
      //  ListNode third  = addNode(second,2);
       // ListNode fourth = addNode(third,1);
        return head;
    }
    static ListNode addNode(ListNode prev, int value){
        ListNode next=new ListNode(value);
        prev.next=next;
        ListNode resNode=prev.next;

        return resNode;
    }
    public boolean isPalindrome(ListNode head) {
        boolean isPalindrome=true;
        int size = findSize(head);
        System.out.println(size);
        int arr[] =buildArray(head,size);
        int mid=size/2;
        int left=0;
        int right=0;
        for(int index=0;index<mid;index++){
            if(size%2==0) {//0,1,2,3,4,5,6
                left  = mid - index - 1;//2,1,0
                right = mid + index ;//3,4,5
            }else{
                left  = mid - 1 - index;//2,1,0
                right = mid + 1 + index;// 4,5,6
            }
            if(arr[left] !=arr[right]){
                isPalindrome=false;
                break;
            }
        }

        return isPalindrome;
    }

    private int[] buildArray(ListNode head,int size) {
        int[] arr=new int[size];
        int i=0;
        while(head!=null){
            arr[i]=head.val;
            i++;
            head=head.next;
        }
        return arr;
    }

    private int findSize(ListNode head) {
        int i=0;
        ListNode searchNode=head;
        while(head!=null){
            System.out.println(head.val);
            i++;
            head=head.next;

        }
        return i;
    }
}

