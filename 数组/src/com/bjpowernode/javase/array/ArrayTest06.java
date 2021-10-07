package com.bjpowernode.javase.array;

/*
1.main方法上面的“String[] args”有什么用
    分析一下：谁负责调用main方法（JVM）
    JVM调用main方法的时候，会自动传一个String数组过来


 */

public class ArrayTest06 {
    public static void main(String[] args) {
        //通过测试，args不是null
        System.out.println("JVM给传递过来的String数组参数长度为：" + args.length);

        //String[] strs = new String[0];
        String[] strs = {};//静态初始化，里面没东西
        printLength(strs);

        //这个数组什么时候会有值呢？
        //其实这个数组是留给客户的，用户在控制台上输入参数，这个参数会自动被转换成“String[] args”
        //例如这样运行程序：java ArrayTest06 abc def xyz
        //这个时候JVM会自动将“abc def xyz”通过空格的方式进行分离，分离完成后自动放到“String[] args”数组中
        //所以main方法上面的String[] args数组主要是用来接收用户输入参数的。
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

    }

    public static void printLength(String[] args){
        System.out.println(args.length);
    }

}
