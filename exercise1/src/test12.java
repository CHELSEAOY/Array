import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test12 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符，按下‘q’键退出。");
        char c;
        do {
             c = (char) br.read();
            System.out.println(c);
        }while (c!='q');
    }
}
