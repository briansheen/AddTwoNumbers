package com.example;

public class Main {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        System.out.println(l1);
        System.out.println(l2);

        System.out.println("SOLUTION:  " + addTwoNumbers(l1, l2));


    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode solution = new ListNode(0);
        ListNode first = l1, second = l2, head = solution;
        int carry = 0;
        while (first != null || second != null) {
            int x = (first != null) ? first.val : 0;
            int y = (second != null) ? second.val : 0;
            int sum = x + y + carry;
            int val = sum % 10;
            carry = sum / 10;
            solution.next = new ListNode(val);
            solution = solution.next;
            if (first != null) {
                first = first.next;
            }
            if (second != null) {
                second = second.next;
            }
        }
        if(carry > 0) {
            solution.next = new ListNode(carry);
        }
        return head.next;
    }
}
