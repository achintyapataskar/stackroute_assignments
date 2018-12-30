import java.awt.*;
import java.util.*;
import java.util.List;

public class Maintest {

    public List<Student> list;
    public List<Student> initAnswerList() {
        List<Student> answerList = new ArrayList<Student>();
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();
        Student s6 = new Student();
        Student s7 = new Student();


        s1.setId("A101");
        s2.setId("A102");
        s3.setId("A103");
        s4.setId("A104");
        s5.setId("A105");
        s6.setId("A106");
        s7.setId("A107");


        s1.setAge(12);
        s2.setAge(13);
        s3.setAge(12);
        s4.setAge(13);
        s5.setAge(14);
        s6.setAge(15);
        s7.setAge(12);

        s1.setName("Freddie Mercury");
        s2.setName("Brian May");
        s3.setName("Roger Taylor");
        s4.setName("John Deacon");
        s5.setName("Mary Austin");
        s6.setName("Bohemian Rhapsody");
        s7.setName("Radio Ga Ga");

        answerList.add(s6);
        answerList.add(s5);
        answerList.add(s4);
        answerList.add(s2);
        answerList.add(s3);
        answerList.add(s7);
        answerList.add(s1);


        return answerList;
    }
    public void initList() {
        list = new ArrayList<Student>();

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();
        Student s6 = new Student();
        Student s7 = new Student();

        s1.setId("A101");
        s2.setId("A102");
        s3.setId("A103");
        s4.setId("A104");
        s5.setId("A105");
        s6.setId("A106");
        s7.setId("A107");

        s1.setAge(12);
        s2.setAge(13);
        s3.setAge(12);
        s4.setAge(13);
        s5.setAge(14);
        s6.setAge(15);
        s7.setAge(12);

        s1.setName("Freddie Mercury");
        s2.setName("Brian May");
        s3.setName("Roger Taylor");
        s4.setName("John Deacon");
        s5.setName("Mary Austin");
        s6.setName("Bohemian Rhapsody");
        s7.setName("Radio Ga Ga");

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s6);
        list.add(s7);

    }

    public List<Student> sortStudents() {
        StudentSorter ss = new StudentSorter();


//        for(Student s : list) {
//            System.out.println(s.getId() + " " + s.getName() + " " + s.getAge());
//        }
        Collections.sort(list, (a, b) -> ss.studentComparator.compare(a, b));
        Collections.reverse(list);

//        for(Student s : list) {
//            System.out.println(s.getId() + " " + s.getName() + " " + s.getAge());
//        }
        return list;
    }

}
