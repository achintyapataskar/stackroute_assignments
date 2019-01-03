import java.io.*;
import java.util.*;

public class CountWords {
    public static void main(String args[]) {
        HashMap<String, Integer> word_count = new HashMap<>();
        Scanner in = null;
        try {
            in = new Scanner(new File("input.txt"));
        } catch (IOException io) {
            System.out.println("File not found");
            System.exit(0);
        }
        while(in.hasNext()) {
            String s = in.next();
            if(word_count.containsKey(s)) {
                int a = word_count.get(s);
                word_count.put(s, a + 1);
            } else {
                word_count.put(s, 1);
            }
        }
        System.out.println(word_count);
    }
}
