public class CountOccurence {
    public int count_char(char match, String input) {
        int count = 0;
        String excluder = "[^" + Character.toString(match) + "]";
        input = input.replaceAll(excluder, "");
        count = input.length();
        return count;
    }
}
