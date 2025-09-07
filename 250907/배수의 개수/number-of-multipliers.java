import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int resultCount3 = 0;
        int resultCount5 = 0;

        // 10 개 입력 고정
        for (int i=0; i<10; i++){

            int value = Integer.parseInt(br.readLine());

            if(value % 3 == 0)
                resultCount3++;
            
            if(value % 5 == 0)
                resultCount5++;

        }

        System.out.println(resultCount3 + " " + resultCount5);

    }
}