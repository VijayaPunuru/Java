package collectionsTest;
import collections.Student;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
public class StudentTest {
    @Test
    public void testFilterStudents() {
        ArrayList<Student> sl = new ArrayList<>();
        sl.add(new Student("vijaya", "lakshmi", 3.9));
        sl.add(new Student("lakshmi", "punuru", 3.0));
        sl.add(new Student("vijju", "vijju", 2.0));
        sl.add(new Student("monika", "p", 4.0));

        Student.filterStudents(sl);
        assertEquals(2, sl.size());
    }
}


