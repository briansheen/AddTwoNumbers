package com.example;

/**
 * Created by bsheen on 9/6/17.
 */
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
