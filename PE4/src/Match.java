import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Match {
    public String[] find_occurences(String pattern, String text) {
        String[] dummy = new String[0];
        if(pattern.length() == 0 || text.length() == 0)
            return dummy;
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        String[] temp_answer = new String[256];
        for(int i = 0; i < 256; i++)
            temp_answer[i] = "";
        int index = 0;
        while(m.find()) {
            temp_answer[index++] = "Found at: " + m.start() + "-" + m.end();
        }
        int len = 0;
        for(int i = 0; !temp_answer[i].equals(""); i++)
            len++;
        String[] answer = new String[len];
        for(int i = 0; i < len; i++)
            answer[i] = temp_answer[i];
        return answer;
    }
}
