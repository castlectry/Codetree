import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int prevValue = Integer.parseInt(st.nextToken());
        int nextValue = Integer.parseInt(st.nextToken());

        System.out.print(prevValue + " " + nextValue + " ");

        for(int i=0; i<8; i++) {

            int tmpValue = (prevValue + nextValue) % 10;

            System.out.print(tmpValue + " ");

            prevValue = nextValue;
            nextValue = tmpValue;

        }

    }
}