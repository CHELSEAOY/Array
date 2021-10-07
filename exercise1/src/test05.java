import com.sun.security.jgss.GSSUtil;

//import java.util.HashMap;
import java.util.*;

public class test05 {
    public static void main(String[] args) {
        HashMap<Integer,String> s = new HashMap<Integer, String>();
        s.put(1,"Google");
        s.put(2,"Runoob");
        s.put(3,"Zhihu");
        System.out.println(s);
        System.out.println(s.get(1));
        System.out.println(s.getOrDefault(0,"--"));
        System.out.println(s.containsKey(1));
        System.out.println(s.containsValue("12"));

//        Set<Map.Entry<Integer, String>> ss = s.entrySet();
//        System.out.println(ss.contains(1));
/*
Map是java中的接口，Map.Entry是Map的一个内部接口。

Map提供了一些常用方法，如keySet()、entrySet()等方法，keySet()方法返回值是Map中key值的集合；
entrySet()的返回值也是返回一个Set集合，此集合的类型为Map.Entry。

Map.Entry是Map声明的一个内部接口，此接口为泛型，定义为Entry<K,V>。它表示Map中的一个实体（一个key-value对）。
接口中有getKey(),getValue方法。
 */


        /*for (Entry:
             ) {
            
        }*/
        
        System.out.println("---------------");
        //HashMap.Entry<Character,Integer> entry:
        s.forEach((key,value) ->{
            key = key + 1;
            System.out.print(key + "=" + value + " ");
        });
    }
}
