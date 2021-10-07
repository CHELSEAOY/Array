package com.bjpowernode.javase.array;

public class ArrayTest02 {
    public static void main(String[] args) {
        //声明/定义动态初始化
        int[] a = new int[4];
        for(int i = 0; i < a.length; i++){
            System.out.println("数组下标为" + i + "的元素是：" + a[i]);
        }

        Object[] objs = new Object[3];
        for(int i = 0; i < objs.length; i++){
            System.out.println("数组下标为" + i + "的元素是：" + objs[i]);
        }


    }
}
