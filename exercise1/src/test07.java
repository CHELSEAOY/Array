import java.util.*;

public class test07 {
    public static void main(String[] args) {
        ArrayList<Integer> s = new ArrayList<>();
        LinkedList<Integer> l = new LinkedList<>();
       // l.offer();
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.offer("sjg");
        System.out.println(list);
        list.offerFirst("1545");
        System.out.println(list);
        list.offerLast(99);
        System.out.println(list);
        list.poll();
        System.out.println(list);
        list.pop();
        System.out.println(list);
        list.push("rlol");
        System.out.println(list);
        System.out.println("---------------");

        HashMap m = new HashMap();
        m.put("ddgg",1);
        m.put("jid",2);
        m.put(null,null);
        m.put(12,"dgd");
        m.put('6','d');
        System.out.println(m);

        System.out.println("-----------------------");

        s.add(25);
        s.add(4);
        s.add(68);
        s.add(6);
        System.out.println(s);
        System.out.println(s.get(1));
        Integer s1 = s.get(3);
        System.out.println(s1);

        s.set(3,10);
        System.out.println(s);

        for (Integer i : s) {
            Integer s2 = i;
            System.out.print(s2 + " ");
        }

        System.out.println('\n');
        Collections.sort(s);
        System.out.println(s);

        s.sort(Comparator.reverseOrder());
        System.out.println(s);
//      int[] a = new int[3];
//      System.out.println(a[1]);

    }
}
