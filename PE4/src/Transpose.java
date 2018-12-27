public class Transpose {
    public String reverse(String input) {
        String reversed_string = "";
        for(int i = input.length() - 1; i >= 0; i--) {
            reversed_string += input.charAt(i);
        }
        return reversed_string;
    }
    public String transpose(String input) {
        String answer = null;
        if(input.equals("")) {
            return "";
        }
        String transposed_string = "";
        String[] tokens = input.split(" ");
        for(String token : tokens) {
            transposed_string += reverse(token) + " ";
        }
        return transposed_string.substring(0, transposed_string.length() - 1);
    }
}
