package com.bjpowernode.javase.array;



public class ArrayTest05 {
    public static void main(String[] args) {
        //数组拷贝
        int[] src = {1, 11, 22, 3 , 4};
        int[] dest = new int[20];

        System.arraycopy(src,1,dest,3,2);

        for (int i = 0; i < dest.length; i++) {
            System.out.println(dest[i]);
        }
    }
}
