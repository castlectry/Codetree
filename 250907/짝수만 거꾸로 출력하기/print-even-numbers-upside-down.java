import java.util.*;
import java.io.*;

public class Main {

    public static boolean isEvenNumber(int number) {
        
        return number % 2 == 0 ? true : false;

    }

    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        /* 초기 입력 */
        List<Integer> list = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i=0; i<N; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        /* 역순으로 조회 */
        for (int i=list.size()-1; i>=0; i--) {

            int nowValue = list.get(i);
            
            if(isEvenNumber(nowValue)) {
                System.out.print(nowValue + " ");
            }

        }



    }
}