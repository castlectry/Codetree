import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        Human A = new Human(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        Human B = new Human(Integer.parseInt(st2.nextToken()), Integer.parseInt(st2.nextToken()));

        if (A.getEnglishScore() > B.getEnglishScore() &&
            A.getMathScore() > B.getMathScore()) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }
}

class Human {

    int mathScore;
    int englishScore;

    public Human(int englishScore, int mathScore) {
        this.englishScore = englishScore;
        this.mathScore = mathScore;
    }

    public void setMathScore(int score) {
        this.mathScore = score;
    }

    public void setEnglishScore(int score) {
        this.mathScore = score;
    }

    public int getMathScore() {
        return mathScore;
    }

    public int getEnglishScore() {
        return englishScore;
    }

}