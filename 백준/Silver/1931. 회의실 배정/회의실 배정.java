import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int result = 1;
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            if (st.hasMoreTokens()) {
                arr[i][0] = Integer.parseInt(st.nextToken());
            }
            if (st.hasMoreTokens()) {
                arr[i][1] = Integer.parseInt(st.nextToken());
            }
        }

        Arrays.sort(arr, (o1, o2) -> {
            if(o1[1] == o2[1]){
                return o1[0] - o2[0];
            }
            return o1[1] - o2[1];
        });

        int start = arr[0][0];
        int end = arr[0][1];
        for(int i=1; i<N; i++){
            if(arr[i][0] >= end){
                result++;
                start = arr[i][0];
                end = arr[i][1];
            }
        }

        System.out.println(result);
    }
}
