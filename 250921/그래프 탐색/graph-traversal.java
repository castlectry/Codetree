import java.util.*;
import java.io.*;


public class Main {

    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] visited;
    static int result = 0;

    public static void dfs(int node) {
        visited[node] = true;
        for(int next : graph.get(node)) {
            if(!visited[next]) {
                result++;
                dfs(next);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        visited = new boolean[N+1];

        // 노드 생성
        for(int i=0; i<=N; i++) {
            graph.add(new ArrayList<>());
        }

        // 간선 입력
        for (int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph.get(x).add(y);
            graph.get(y).add(x);    // 양방향이라 하나 더 추가
        }

        dfs(1); // DFS 1번 노드부터 시작

        System.out.println(result);
    }
}