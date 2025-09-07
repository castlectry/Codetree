import java.util.*;
import java.io.*;

public class Main {

    public static char checkGrade(int score) {

        return score >= 90 ? 'A' : 
               score >= 80 ? 'B' :
               score >= 70 ? 'C' :
               score >= 60 ? 'D' : 'F';

    }

    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i=N; i<=100; i++) {

            System.out.print(checkGrade(i) + " ");

        }

    }

}