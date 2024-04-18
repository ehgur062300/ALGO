import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            Stack<Character> s = new Stack<>();
            String str = br.readLine();
            if(str.equals(".")) { break; }

            for(int i=0; i<str.length(); i++){
                char c = str.charAt(i);

                if(c=='(' || c=='['){
                    s.push(c);
                } else if(c==')'){
                    if(!s.empty() && s.peek().equals('(')){
                        s.pop();
                    }else {
                        s.push(c);
                    }
                } else if(c==']'){
                    if(!s.empty() && s.peek().equals('[')){
                        s.pop();
                    } else {
                        s.push(c);
                    }
                }
            }

            if(s.isEmpty()){
                bw.write("yes\n");
            } else {
                bw.write("no\n");
            }
            bw.flush();
        }
    }
}
