/*
在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。
 */

//import java.util.HashMap;
//import java.util.Scanner;
//import java.util.Set;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class test01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //System.out.println("请输入一个字符串:");
        //String s = in.next();
        String s = "jahjdat";

        //test01 t = new test01();
        char res =firstUniqChar1(s);

        //Solution re = new Solution();
       // char res = re.firstUniqChar(s);
        System.out.println("第一个只出现一次的字符是：" + res);
        /*‘
        System.out.println(frequents);
        System.out.println(frequents.get('a'));
        System.out.println(frequents.keySet());
        System.out.println(frequents.values());
        System.out.println(frequents.getOrDefault('j',0));*/
        System.out.println(firstUniqChar2(s));

    }



//class Solution {


    //使用哈希表存储频数
    public static char firstUniqChar1(String s) {
        LinkedHashMap<Character, Integer> frequents = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            //System.out.print(ch + " ");
            frequents.put(ch, frequents.getOrDefault(ch, 0) + 1);
        }

        //System.out.println(frequents);


        //使用哈希表存储索引
//        for (int i = 0; i < s.length(); i++) {
//            if (frequents.get(s.charAt(i)) == 1) {
//                return s.charAt(i);
//            }
//        }

        for (Character c: frequents.keySet()
             ) {
            if (frequents.get(c) == 1){
                return c;
            }

        }

        return ' ';
    }

    public static char firstUniqChar2(String s){

        HashMap<Character,Integer> m = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(m.containsKey(ch)){
                m.put(ch,-1);
            }else{
                m.put(ch,i);
            }
        }

        int first = s.length();
        Set<Entry<Character, Integer>> e = m.entrySet();
        for (Entry<Character, Integer> v: e) {
            int pos = v.getValue();
            if(pos != -1 && pos < first){
                first = pos;
            }
        }
        return first == s.length() ? ' ' : s.charAt(first);
    }

 }