/*
计算字符串 23743298奇数位偶数位之和
 */
/*
一、string 和int之间的转换

1、string转换成int  :Integer.valueOf("12")

2、int转换成string : String.valueOf(12)

二、char和int之间的转换

1、首先将char转换成string

String str=String.valueOf('2')

2、转换

Integer.valueof(str) 或者Integer.PaseInt(str)

Integer.valueof返回的是Integer对象，Integer.paseInt返回的是int
 */


import java.util.Arrays;

public class test03 {
    public static void main(String[] args) {
        String s = "23743298";
//        String[] str = s.split("");
//        System.out.println(Arrays.toString(str));
            int oddSum = 0;
            int evenSum = 0;
//        for (String value : str) {
//            int num = Integer.parseInt(value);
//            if (num % 2 == 0) evenSum += num;
//            else oddSum += num;
//        }

        for (int i = 0; i < s.length(); i++) {
            int num = Integer.parseInt(String.valueOf(s.charAt(i)));
            if(num%2==0) evenSum += num;
            else oddSum += num;

        }



        System.out.println("该字符串的奇数位之和为：" + oddSum);
        System.out.println("该字符串的偶数位之和为：" + evenSum);

    }
}
