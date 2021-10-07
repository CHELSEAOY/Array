package com.bjpowernode.javase.array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Three_Color_Flag {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        data();
    }

    //排列为蓝，白，红的顺序
    public static void data() {
        String[] color = {"蓝","白","红","白","蓝","红","白","白","红","蓝"};
        List<String> co = new ArrayList<String>();//list互换方便，所以作者又把数组换成list了..........
        for(String x : color) {
            co.add(x);
        }
        String replace;
        int y=0;//排序头指针
        int z=color.length-1;//排序尾指针
        int count = 0;
        for(int x = 0;x<=z;x++) {
            if(co.get(x).equals("红")) {
                replace = co.get(y);
                co.set(y, co.get(x));
                co.set(x, replace);
                y++;
            }else if(co.get(x).equals("蓝")) {
                replace = co.get(z);
                co.set(z, co.get(x));
                co.set(x, replace);
                x--;
                z--;
            }
            count++;
        }
        //Collection.reverse(co);
        System.out.println("排列次数："+count);
        for(String x :co) {
            System.out.print(x);
        }

    }
}