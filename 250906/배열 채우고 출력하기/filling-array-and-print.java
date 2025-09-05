import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Character> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(st.nextToken().charAt(0));
        }

        Collections.reverse(list);

        for (Character value : list) {
            System.out.print(value);
        }
        
    }
}
