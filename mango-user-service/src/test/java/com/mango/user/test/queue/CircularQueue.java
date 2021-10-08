package com.mango.user.test.queue;

/**
 * 基于数组的循环队列
 *
 * @author xs.Liu
 * @version 1.0.0
 * @since 2021/9/5 10:18
 */
public class CircularQueue {

    /**
     * 数组items
     */
    private String[] items;

    /**
     * 数组大小
     */
    private int n = 0;

    /**
     * 队头下标
     */
    private int head = 0;

    /**
     * 队尾下标
     */
    private int tail = 0;

    /**
     * 申请一个大小为n 的数组
     * @param n
     */
    public CircularQueue(int n) {
        items = new String[n];
        this.n = n;
    }

    /**
     * 入队
     *
     * @param item 入队值
     * @return 入队结果
     */
    public boolean enqueue(String item) {
        // 队列满了
        if ((tail + 1) % n == head) {
            return false;
        }

        items[tail] = item;
        tail = (tail + 1) % n;
        return true;
    }

    /**
     * 出队
     *
     * @return 出队值
     */
    public String dequeue() {
        // 如果head == tail 表示队列为空
        if (head == tail) {
            return null;
        }

        String ret = items[head];
        head = (head + 1) % n;
        return ret;
    }
}

