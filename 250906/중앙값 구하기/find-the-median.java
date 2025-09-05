import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int arr[] = new int[3];

        for (int i=0; i<3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 오름차순 기준 중앙 값

        Arrays.sort(arr);   // 정렬

        System.out.println(arr[1]);





    }
}