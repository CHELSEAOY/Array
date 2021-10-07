import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class test10 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put(4,5);
        hashMap.put('d',5);
        hashMap.put("sdg",'d');
        System.out.println(hashMap);



        Set set = hashMap.entrySet();
        System.out.println(set);
//        for (Entry<> i : hashMap.keySet()
//             ) {
//            System.out.println(i.getValue());
//        }
//        Iterator it = set.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
    }


    public static <E> void printMap(){

    }
}
