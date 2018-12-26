import java.util.Scanner;

public class Vowels {
    public boolean isVowel(char test_for_vowel) {
        if(
               test_for_vowel == 'a'
            || test_for_vowel == 'e'
            || test_for_vowel == 'i'
            || test_for_vowel == 'o'
            || test_for_vowel == 'u'
            || test_for_vowel == 'A'
            || test_for_vowel == 'E'
            || test_for_vowel == 'I'
            || test_for_vowel == 'O'
            || test_for_vowel == 'U'
        ) {
            return true;
        }
        return false;
    }
    public String remove_vowels(String str) {
        String answer = "";
        for(int i = 0; i < str.length(); i++) {
            if(isVowel(str.charAt(i))) {
                answer += "";
            } else {
                answer += str.charAt(i);
            }
        }
        return answer;
    }
    public static void main(String args[]) {
        Vowels v = new Vowels();
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        System.out.println(v.remove_vowels(input));
    }
}
