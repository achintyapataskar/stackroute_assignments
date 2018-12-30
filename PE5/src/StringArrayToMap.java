import java.util.HashMap;
import java.util.Map;

/*3. Write a program where an array of strings is input and output is a Map< String ,boolean> where
*        each different string is a key and its value is true if that string appears 2 or more times in the array
*        Input : String arr[] = {“a”,”b”,”c”,”d”,”a”,”c”,”c”}
        Output - {“a” : true,”b” :false ,”c” :true,”d” : false}*/
public class StringArrayToMap {
    public Map<String, Boolean> createMap(String[] input) {
        Map<String, Boolean> m = new HashMap<>();
        if(input.length == 0)
            return m;
        for(String str : input) {
            if(m.containsKey(str)) {
                if (m.get(str) == true)
                    continue;
                if (m.get(str) == false) {
                    m.put(str, true);
                    continue;
                }
            }
            m.put(str, false);
        }
        return m;
    }
}
