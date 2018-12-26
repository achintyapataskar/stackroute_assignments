import java.io.FileNotFoundException;

public class Exceptions {
    public static void main(String args[]) {
        Exception e = new Exception("Radio Ga Ga, Radio Goo Goo");
        try {
            throw e;
        } catch (Exception e1) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Bohemian Rhapsody");
        }
    }
}
