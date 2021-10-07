import java.util.*;

public class test09 {
    public static void main(String[] args) {
        HashMap<Integer,Character> hashMap = new HashMap<>();
        hashMap.put(2,'a');
        hashMap.put(1,'g');
        hashMap.put(5,'k');
        hashMap.put(0,'d');
        System.out.println(hashMap);

        System.out.println("----------------------------------");
        LinkedHashMap<Integer,Character> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(2,'a');
        linkedHashMap.put(1,'g');
        linkedHashMap.put(5,'k');
        linkedHashMap.put(0,'d');
        System.out.println(linkedHashMap);
    }



}
