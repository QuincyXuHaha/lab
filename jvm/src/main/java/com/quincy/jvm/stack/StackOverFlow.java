package com.quincy.jvm.stack;

/**
 * 测试
 *
 * @author quincy
 * @date 2019/1/15 星期二
 */
public class StackOverFlow {

    public static long index = 0L;

    public static void call() {
        index++;
        call();
    }


    public static void main(String[] args) {
        try {
            call();
        } catch (Throwable th) {
            System.out.println("调用栈深度：" + index);
        }


    }


}
