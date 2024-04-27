import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int[] parent;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int nums = Integer.parseInt(br.readLine());
        parent = new int[nums+1];
        for(int i = 1; i <= nums; i++){
            parent[i] = i;
        }

        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            union(start,end);
        }

        int cnt = 0;
        for(int i = 2; i <= nums; i++){
            if(find(1) == find(i))
                cnt++;
        }

        System.out.print(cnt);
    }

    private static int find(int n){
        if(parent[n] == n)
            return n;
        else
            return parent[n] = find(parent[n]);
    }

    private static void union(int x, int y){
        int find_x = find(x);
        int find_y = find(y);

        if(find_x != find_y) {
            parent[find_y] = find_x;
        }
    }
}
