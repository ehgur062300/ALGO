import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String,String> map = new HashMap<>();


        for(int i=0; i<N; i++){
            String name = br.readLine();
            String idx = String.valueOf(i+1);
            map.put(name,idx);
            map.put(idx,name);
        }

        for(int i=0; i<M; i++){
            String problem = br.readLine();
            System.out.println(map.get(problem));
        }

    }
}