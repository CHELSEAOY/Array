import java.util.Arrays;

public class test04 {
    public static void main(String[] args) {
//        int p = 1;
//        System.out.println(p++);
//        System.out.println(++p);
        int[] s = {1,2,3,4};
        ChangIt it = new ChangIt();
        it.doIt(s);
        System.out.println(Arrays.toString(s));
    }
}

class ChangIt{
      public  void doIt(int[] z){
        z = null;
    }
}
