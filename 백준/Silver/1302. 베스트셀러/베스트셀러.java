import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> booksSoldToday = new HashMap<>();

        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            String book = br.readLine();

            booksSoldToday.put(book, booksSoldToday.getOrDefault(book, 1)+1);
        }

        String bestSeller = booksSoldToday.entrySet()
                                    .stream()
                                    .min(
                                            Map.Entry.<String, Integer>comparingByValue(Comparator.reverseOrder())
                                                    .thenComparing(Map.Entry.comparingByKey()))
                                    .get()
                                    .getKey();

        System.out.println(bestSeller);
    }
}
