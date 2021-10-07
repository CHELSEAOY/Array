import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Set;


public class test06 {
    public static void main(String[] args) {
        HashMap<Integer,String> s = new HashMap<>();
        s.put(1,"a");
        s.put(2,"b");
        s.put(3,"c");
        s.put(4,"d");
        System.out.println(s);


        System.out.println(s.keySet());
        System.out.println(s.entrySet());

        System.out.println("----------");
        Set<Integer> key = s.keySet();
        System.out.println(key);

        Set<String> hs = new HashSet<String>();
        hs.add("1");
        hs.add("fgs");
        System.out.println(hs);
        Iterator<String> it = hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("--------------------");
        Set<Entry<Integer,String>> e = s.entrySet();
        System.out.println(e);
        for (Entry<Integer,String> pos: e) {
            System.out.println(pos.getKey());
            System.out.println(pos.getValue());

        }
        System.out.println("--------------------");
        Iterator<Entry<Integer,String>> itt = e.iterator();

//        while(itt.hasNext()){
//            Entry<Integer,String> ee = itt.next();
//            System.out.println(ee.getKey());
//            System.out.println(ee.getValue());
//        }


    }
}
