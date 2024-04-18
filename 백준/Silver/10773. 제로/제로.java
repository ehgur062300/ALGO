
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        Stack<Integer> s = new Stack<>();

        int sum = 0;
        for(int i=0; i<t; i++){
            int n = Integer.parseInt(br.readLine());

            if(n != 0){
                s.push(n);
                sum += s.peek();

            } else {
                sum -= s.pop();
            }
        }
        System.out.print(sum);
    }
}
