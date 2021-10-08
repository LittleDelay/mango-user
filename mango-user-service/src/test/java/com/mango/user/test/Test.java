package com.mango.user.test;

import io.swagger.models.auth.In;
import org.apache.commons.lang3.StringUtils;
import org.assertj.core.util.Strings;

import java.util.Arrays;

/**
 * @author xs.Liu
 * @version 1.0.0
 * @since 2021/5/28 10:14
 */
public class Test {

    public static void main(String[] args) {
       /* ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(2);
        ListNode l5 = new ListNode(1);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;

        boolean palindrome = isPalindrome(l1);
        System.out.println(palindrome);*/


        String str = "小明:87; 小花:81; 小红:97; 小天:76;小张:74;小小:94;小西:90;小伍:76;小迪:64;小曼:76";
        String[] split = str.split(";");

        int scoreCount = 0;
         for (String sp : split) {
             String s = StringUtils.substringAfter(sp, ":");
             scoreCount += Integer.valueOf(s);
         }

        int aveScore = scoreCount / split.length;
        System.out.println("总分数为------------" + scoreCount);
        System.out.println("平均分数为------------" + aveScore);


    }

    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        if (fast != null) {
            slow = slow.next;
        }

        while (slow != null) {
            if (slow.val != prev.val) {
                return false;
            }
            slow = slow.next;
            prev = prev.next;
        }

        return true;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
