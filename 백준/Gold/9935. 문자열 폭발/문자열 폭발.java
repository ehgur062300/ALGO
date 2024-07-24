import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    private static final String FRULA = "FRULA";

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String trigger = br.readLine();

        int triggerLength = trigger.length();
        Stack<Character> stack = getCharacters(str, triggerLength, trigger);

        if (stack.isEmpty()) {
            System.out.print(FRULA);
        } else {
            StringBuilder sb = new StringBuilder();
            for (char c : stack) {
                sb.append(c);
            }
            System.out.print(sb);
        }
    }

    private static Stack<Character> getCharacters(String str, int triggerLength, String trigger) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
            if (stack.size() >= triggerLength) {
                boolean match = true;
                for (int i = 0; i < triggerLength; i++) {
                    if (stack.get(stack.size() - triggerLength + i) != trigger.charAt(i)) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    for (int i = 0; i < triggerLength; i++) {
                        stack.pop();
                    }
                }
            }
        }
        return stack;
    }
}
