import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++){
            int n = Integer.parseInt(br.readLine());
            if(n == 0){
                if(minHeap.isEmpty())
                    System.out.println(0);
                else
                    System.out.println(minHeap.poll());

            } else {
                minHeap.add(n);
            }
        }
    }
}