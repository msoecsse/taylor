package wk1;

import java.util.List;

public class Driver {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("hay");
        words.add("cheese");
        words.add(null);
        System.out.println(words.contains(null));
    }
}
