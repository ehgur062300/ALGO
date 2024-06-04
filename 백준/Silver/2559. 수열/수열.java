import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Queue<Integer> queue = new LinkedList<>();

        int max = -10000001;
        int sum = 0;
        st = new StringTokenizer(br.readLine(), " ");
        while (n-- > 0) {
            int temp = Integer.parseInt(st.nextToken());

            if (queue.size() == k) {
                max = Math.max(max, sum);
                sum -= queue.poll();
            }
            queue.add(temp);
            sum += temp;
        }
        if(queue.size() == k){
            max = Math.max(max, sum);
        }
        System.out.print(max);
    }
}