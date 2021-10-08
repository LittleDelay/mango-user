package com.mango.user.test.listlink;

/**
 * 链表
 *
 * @author xs.Liu
 * @version 1.0.0
 * @since 2021/9/4 10:24
 */
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

}
