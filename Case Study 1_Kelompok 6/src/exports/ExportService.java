package exports;

import courses.Course;
import students.Student;
import students.Transcript;
/**
 * Abstract Factory assumes that you have several families of products,
 * structured into separate class hierarchies (Button/Checkbox). All products of
 * the same family have the common interface.
 *
 * This is the common interface for ExportService family.
 */
public interface ExportService {
    String exportStudent(Student student);
    String exportCourse(Course course);
    String exportTranscript(Transcript transcript);
}