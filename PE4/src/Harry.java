import java.util.regex.Pattern;

public class Harry {
    public boolean find(String input) {
//        Pattern p = new Pattern();
        return Pattern.matches("[a-z 0-9]*Harry[a-z 0-9]*", input);
    }
}
