import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder(br.readLine());

        sb.setCharAt(1, 'a');
        sb.setCharAt(sb.length()-2, 'a');

        System.out.println(sb.toString());



    }
}