//package com.bjpowernode.javase.array;

public class test {
    public static void main(String[] args) {
        if(args.length != 2){
            System.out.println("ʹ�ø�ϵͳʱ�������������������û��������롣");
            return;
        }

        String username = args[0];
        String password = args[1];

        if(username.equals("admin") && password.equals("123")){
            System.out.println("��½�ɹ�����ӭ" + username + "����");
        }else{
            System.out.println("��֤ʧ�ܣ��û��������������");
        }
    }
}
