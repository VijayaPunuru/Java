package collections;
import java.util.ArrayList;
public class Student {
    String firstName;
    String lastName;
    double gpa;

    public Student(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }
    public static void filterStudents(ArrayList<Student> stu) {
        double temp = 0;
        for (Student student : stu) {
            temp = temp+student.gpa;
        }
        double averageGPA = temp / stu.size();

        stu.removeIf(student -> student.gpa < averageGPA);
    }

}



