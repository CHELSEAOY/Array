import java.util.Arrays;

public class test08 {
    public static void main(String[] args) {
        char s = 'c';  //'a' = 97
        int[] c = {10,2,3,4,5};
        System.out.println(Arrays.toString(c));
        System.out.println(s - 'a');
        System.out.println(c[s - 'a']);
        System.out.println(c[s - 'a']++);
        System.out.println(Arrays.toString(c));
        int[] hash = new int [128];
        hash['A']=1;
        System.out.println(Arrays.toString(hash));
        //System.out.println(firstUniqchar("dacd"));
        System.out.println("----------------------");
        test08 t = new test08();
        System.out.println(t.firstUniqchar("sgtfds"));
        System.out.println("-------------");
        String ss = "sdsgsfg";
        System.out.println(ss.toUpperCase());
        char[] chars = ss.toCharArray();
        System.out.println(Arrays.toString(chars));

    }

    public  char firstUniqchar(String s){
        int[] cnt = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            cnt[cur - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if(cnt[cur - 'a']==1){
                return cur;
            }
        }

        return ' ';
    }

}
