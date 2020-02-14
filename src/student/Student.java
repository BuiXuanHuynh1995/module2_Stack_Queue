package student;

public class Student {
    private int id;
    private  String studentName;
    private String gender;
    private int age;

    public Student() {
    }

    public Student(int id, String studentName, String gender, int age) {
        this.id = id;
        this.studentName = studentName;
        this.gender = gender;
        this.age=age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student with id: "
                +getId()+" name: "
                +getStudentName()+" gender: "
                +getGender()+" age: "
                +getAge();
    }
}
