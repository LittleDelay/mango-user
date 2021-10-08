package com.mango.user.test.listlink;

import com.mango.core.bean.request.PageReq;

import java.util.List;

/**
 * 链表操作工具类
 *
 * @author xs.Liu
 * @version 1.0.0
 * @since 2021/9/4 10:25
 */
public class Solution {

    /**
     * 迭代反转
     *
     * @param head 头节点
     * @return 反转列表
     */
    public static ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }

        return prev;

    }

    /**
     * 链表反转-递归方式
     *
     * @param head 链表头节点
     * @return 反转链表
     */
    public static ListNode reverseListD(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p = reverseListD(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }

    public static boolean hasCycle(ListNode head) {

        ListNode fastNext = head;
        ListNode slowNext = head;

        while (fastNext != null) {
            fastNext = fastNext.next;
            if (fastNext.next != null) {
                fastNext = fastNext.next;
            }

            if (fastNext == slowNext) {
                return true;
            }
            slowNext = slowNext.next;
        }

        return false;
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);
        l1.next.next.next.next = new ListNode(5);
        l1.next.next.next.next.next = new ListNode(6);
        System.out.println(l1.toString());

        ListNode listNode = reverseList(l1);
        System.out.println(listNode);


        ListNode ll1 = new ListNode(1);
        ListNode ll2 = new ListNode(2);
        ll1.next = ll2;
        ll1.next.next = new ListNode(3);
        ll1.next.next.next = new ListNode(4);
        ll1.next.next.next.next = new ListNode(5);
        ll1.next.next.next.next.next = new ListNode(6);
        ll1.next.next.next.next.next.next = ll2;
        System.out.println(ll1.toString());

        boolean b = hasCycle(ll1);
        System.out.println("是否有环的存在" + b);

    }

}