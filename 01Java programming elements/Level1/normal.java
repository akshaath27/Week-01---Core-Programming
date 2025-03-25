class Student
{
    static int totalStudents=0;
    String name;
    Student(String name) {
        this.name = name;
        totalStudents++;
    }
}
public class normal{
    public static void main(String[] args) {
        Student s1 = new Student("John");
        Student s2 = new Student("Jane");
        System.out.println(Student.totalStudents);
    }
}