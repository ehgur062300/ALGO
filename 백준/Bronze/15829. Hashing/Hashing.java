
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        long[] arr = new long[t];

        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken();

        arr[0] = 1;
        for(int i=1; i<t; i++){ arr[i] = arr[i-1]*31%1234567891; }

        long sum = 0;
        for(int i=0; i<s.length(); i++){
            sum += (s.charAt(i)-96)*arr[i];
        }
        System.out.print(sum%1234567891);

    }
}
