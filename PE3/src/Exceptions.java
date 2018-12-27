//7. Create a class with a main( ) that throws an object of class Exception inside a try block.
//        a. Give the constructor for Exception a String argument.
//        b. Catch the exception inside a catch clause and print the String argument.
//        c. Add a finally clause and print a message to prove you were there.

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
