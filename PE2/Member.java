import java.io.*;
import java.util.*;

class MemberVariable {
    Member m = new Member();
    public void initialize() {
        m.name = "Default_Name";
        m.age = 50;
        m.salary = 20;
    }
    public void print() {
        System.out.printf("Name: %s\nAge: %d\nSalary: %d\n", m.name, m.age, m.salary);
    }
}
public class Member {
    String name;
    int age, salary;
    public static void main(String args[]) {
        MemberVariable mv = new MemberVariable();
        mv.initialize();
        mv.print();
    }
}
