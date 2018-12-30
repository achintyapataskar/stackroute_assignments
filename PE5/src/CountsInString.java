/*2. Write a program to find the number of counts in the following String . Store the output in
*        Map< String ,Integer> as key value pair.
*        Input : String str = “one one -one___two,,three,one @three*one?two”;
*        Output : {"one":5 , "two":2, "three" :2}*/
import java.util.HashMap;
import java.util.Map;

public class CountsInString {

    public Map<String, Integer> counts(String s) {
        Map<String, Integer> m = new HashMap<>();
        if(s.equals(""))
            return m;
        s = s.replaceAll("[^a-zA-Z]+", " ");
        String[] tokens = s.split("[^a-zA-Z]");
        for(String token : tokens) {
            token = token.trim();
            m.put(token, 0);
        }
        for(String token : tokens) {
            int value = m.get(token);
            m.put(token, ++value);
        }
        return m;
    }
}
