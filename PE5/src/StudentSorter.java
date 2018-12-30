import java.util.Comparator;
import java.util.List;

public class StudentSorter {
    //    Comparator<String> comp = new Comparator<String>() {
    Comparator<Student> studentComparator = new Comparator<Student>() {
        public int compare(String o1, String o2) {
            int min = o1.length();
            if (o1.length() >= o2.length()) {
                min = o2.length();
            }
            for (int i = 0; i < min; i++) {
                if (o1.charAt(i) != o2.charAt(i)) {
                    return Character.getNumericValue(o1.charAt(i)) - Character.getNumericValue(o2.charAt(i));
                }
            }
            return 0;
        }
        @Override
        public int compare(Student s1, Student s2) {
            if (s1.getAge() != s2.getAge()) {
                return s1.getAge() - s2.getAge();
            }
            return compare(s1.getName(), s2.getName());
        }
    };
}
