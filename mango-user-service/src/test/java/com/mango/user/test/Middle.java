package com.mango.user.test;

/**
 * @author xs.Liu
 * @version 1.0.0
 * @since 2021/9/2 20:15
 */
public class Middle extends Top{

    public Middle() {
        x += 1;
    }

    public static void main(String[] args) {
        Middle m = new Middle();
        System.out.println(x);
    }
}
