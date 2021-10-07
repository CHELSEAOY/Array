//package com.bjpowernode.javase.array;

public class test {
    public static void main(String[] args) {
        if(args.length != 2){
            System.out.println("使用该系统时请输入程序参数，包括用户名和密码。");
            return;
        }

        String username = args[0];
        String password = args[1];

        if(username.equals("admin") && password.equals("123")){
            System.out.println("登陆成功，欢迎" + username + "回来");
        }else{
            System.out.println("验证失败，用户名或者密码错误");
        }
    }
}
