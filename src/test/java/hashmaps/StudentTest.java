package hashmaps;
import hashmaps.StudentHashmap;
import org.junit.Test;

import java.util.HashMap;
import static org.junit.Assert.assertEquals;

public class StudentTest {
    @Test
    public void testGetStudentByName() {
        Student aditya = new Student("aditya", "a", 3.8);
        Student vijaya = new Student("vijaya", "v", 4.0);
        Student manasa = new Student("manasa", "m", 3.5);
        Student mounika = new Student("mounika", "m", 3.8);
        Student shivani = new Student("shivani", "s", 4.0);
        Student lavanya = new Student("lavanya", "l", 3.5);
        Student prathiba = new Student("prathiba", "p", 3.8);
        Student sunitha = new Student("sunitha", "s", 4.0);

        StudentHashmap stud = new StudentHashmap();
        stud.addStudent(aditya);
        stud.addStudent(vijaya);
        stud.addStudent(manasa);
        stud.addStudent(mounika);
        stud.addStudent(shivani);
        stud.addStudent(lavanya);
        stud.addStudent(prathiba);
        stud.addStudent(sunitha);

        assertEquals(aditya, stud.getStudentByName("aditya"));
        assertEquals(vijaya, stud.getStudentByName("vijaya"));
        assertEquals(sunitha, stud.getStudentByName("sunitha"));

    }

}
