public class SortWords {
    public String[] extract_words(String input) {
        if(input.length() == 0)
            return null;
        input = input.replaceAll("\\s+", " ");
        input = input.trim();
        String[] tokenized_string = input.split(" ");
        return tokenized_string;
    }
}
