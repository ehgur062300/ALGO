import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        List<Word> str = new ArrayList<>();
        Set<String> set = new HashSet<>();

        for(int i=0; i<t; i++){
            String temp = sc.next();
            int len = temp.length();
            Word word = new Word(len,temp);

            if(!set.contains(temp)){
                set.add(temp);
                str.add(word);
            }
        }

        str.sort(new LengthComparator());
        for(Word w : str){
            System.out.println(w.str);
        }

    }
}

class LengthComparator implements Comparator<Word> {
    @Override
    public int compare(Word w1, Word w2){
        if(w1.len == w2.len){
            return w1.str.compareTo(w2.str);
        }
        return w1.len - w2.len;
    }
}

class Word {
    int len;
    String str;

    public Word(int len, String str) {
        this.len = len;
        this.str = str;
    }
}