package com.bjpowernode.javase.array;

public class ArrayTest03 {
    public static void main(String[] args) {

        //调用方法时传一个数组
        int[] x = {1, 5, 8, 89};
        printArray(x);

        String[] strs = {"ss", "ki", "koel"};
        printArray(strs);


        System.out.println("-----------------------");
        int[] a2 = new int[4];
        printArray(a2);

        System.out.println("-------------------");
        printArray(new int[3]);
        System.out.println("------------------------");
        printArray(new int[]{1, 2, 3, 4});  //如果直接传递一个静态数组的话，语法必须这样写
    }

    public static void printArray(int[] array){
        for (int value : array) {
            System.out.println(value);
        }
    }

    public static void printArray(String[] args){
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
