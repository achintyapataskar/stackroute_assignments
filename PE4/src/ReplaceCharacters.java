public class ReplaceCharacters {
    public String replace(String input) {
        String answer = "";
        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == 'd') {
                answer += 'f';
                continue;
            }
            if(input.charAt(i) == 'l') {
                answer += 't';
                continue;
            }
            answer += input.charAt(i);
        }
        return answer;
    }
}
