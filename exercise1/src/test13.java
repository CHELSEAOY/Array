import java.io.BufferedReader;
import java.io.InputStreamReader;


public class test13{
    public static void main(String[] args)throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] ch = str.toCharArray();
        int[] hash = new int [128];
        for(int i=0;i<str.length();i++) {
            if(ch[i]>='a'&&ch[i]<='z'||ch[i]>='A'&&ch[i]<='Z') {
                hash[ch[i]]++;
            }
            if(hash[ch[i]]==3) {
                System.out.println(ch[i]);
                break;
            }
        }
    }

}