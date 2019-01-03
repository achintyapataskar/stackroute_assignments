import java.io.*;
import java.util.*;

public class Directory {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String given_extension = in.nextLine();
        File folder = new File("/home/user/Documents/pe2/src/");
        File[] list_of_files = folder.listFiles();
        for(File file: list_of_files) {
            if(file.isFile()) {
                String file_name = file.getName();
                String extension = "";
                int length_of_file_name = file_name.length();
                for(int i = length_of_file_name - 1; i >= 0 && file_name.charAt(i) != '.'; i--) {
                    extension = file_name.charAt(i) + extension;
                }
                if(extension.compareTo(given_extension) == 0) {
                    System.out.println(file_name);
                }
            }
        }
    }
}
