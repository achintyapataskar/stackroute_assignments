import java.io.FileNotFoundException;

public class TypesOfExceptions {
    public void init_array(int size) throws NegativeArraySizeException {
        int[] arr = new int[size];
    }
    public void traverse_array(int index) throws IndexOutOfBoundsException {
        int[] arr = new int[10];
        System.out.println(arr[index]);
    }
    public void empty_object() throws NullPointerException {
        int[] arr = null;
        System.out.println(arr[4]);
    }
    public static void main(String args[]) {
        TypesOfExceptions te = new TypesOfExceptions();
        Exception neg = new Exception("Negative size for array");
        Exception bounds = new Exception("Index out of bounds.");
        Exception null_pointer = new Exception("Null Pointer Exception.");
        try {
            for(int i = -5; i < 5; i++) {
                te.init_array(i);
            }
        } catch(Exception e1) {
            System.out.println(neg.getMessage());
        }
        try {
            te.traverse_array(40);
        } catch(Exception e1) {
            System.out.println(bounds.getMessage());
        }
        try {
            te.empty_object();
        } catch(Exception e1) {
            System.out.println(null_pointer.getMessage());
        }
    }

}
