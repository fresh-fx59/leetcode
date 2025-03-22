package org.example;


import java.util.LinkedList;

/*
https://www.youtube.com/watch?v=fnZAImSvWXs&list=PLoDervMHdCDJBy_6BEx4eUM2QvuYHFYja&index=8
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    private static ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}