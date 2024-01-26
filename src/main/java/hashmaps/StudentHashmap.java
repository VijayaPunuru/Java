package hashmaps;
import java.util.HashMap;
public class StudentHashmap{
    private HashMap<String, Student> s;

    public StudentHashmap() {
        this.s = new HashMap<>();
    }
    public void addStudent(Student student) {
        s.put(student.firstName, student);
    }

    public Student getStudentByName(String firstName) {
        return s.get(firstName);
    }

}
