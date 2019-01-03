import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

import static org.junit.Assert.*;

public class MaintestTest {
    @Test
    public void sortTest() {
        List<Student> list = new ArrayList<Student>();
        Maintest mt = new Maintest();
        StudentSorter ss = new StudentSorter();

//        List<Student> t = mt.list;
        //assertEquals(list, t);//why are two completely different objects compared??

        mt.initList();
        List<Student> manually_sorted_list = mt.initAnswerList();
        List<Student> test = mt.sortStudents();
        assertEquals(manually_sorted_list, test);
    }
}