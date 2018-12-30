public class Student {
    private String id;
    private String name;
    private int age;
    public void setId(String inputId) {
        id = inputId;
    }
    public void setName(String inputName) {
        name = inputName;
    }
    public void setAge(int inputAge) {
        age = inputAge;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
//    @Override
//    public String toString() {
//        String answer = "";
//        answer = id + " " + name + " " + age;
//        return answer;
//    }
}
