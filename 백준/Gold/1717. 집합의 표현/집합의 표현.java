import java.util.*;

public class Main {
    static int[] p;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        p = new int[n+1];

        for(int i=1; i<=n; i++){
            p[i] = i;
        }

        for(int i=0; i<m; i++){
            int cmd = sc.nextInt();
            int node1 = sc.nextInt();
            int node2 = sc.nextInt();

            if(cmd == 0){
                union(node1, node2);
            } else {
                if(find(node1) == find(node2)){
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }

    }
    public static int find(int node){
        if(node == p[node])
            return node;
        else
            return p[node] = find(p[node]);
    }

    public static void union(int a, int b){
        int find_a = find(a);
        int find_b = find(b);

        if(find_a != find_b){
            p[find_b] = a;
        }
    }
}