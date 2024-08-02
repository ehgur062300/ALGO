import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static int[] trees;
    private static int N,M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        trees = new int[N];

        int max = -1, min = 0;
        for (int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max,trees[i]);
        }

        System.out.print(binarySearch(min,max));
    }

    private static int binarySearch(int start, int end){

        if(start > end) return end;

        int mid = (start+end)/2;
        long tree=0;
        
        for(int i=0; i<N; i++) {
            if(trees[i]>mid) tree += trees[i]-mid;
        }
        if(tree>=M) {
            start = mid+1;
        }else if(tree<M) {
            end = mid-1;
        }
        return binarySearch(start,end);
    }
}