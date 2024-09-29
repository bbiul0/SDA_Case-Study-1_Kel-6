package enrollment;

import courses.Course;
import students.Student;

public class EnrollmentService {
    public Student createStudent(String name, String studentId) {
        return new Student(name, studentId);
    }
}

/*
//contoh implementasi base untuk class EnrollmentService:
public class EnrollmentService implements Base {
    private Student student;
    private String studentName;
    private String studentId;

    public EnrollmentService(String studentName, String studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
    }

    @Override
    public void execute() {
        student = createStudent(studentName, studentId);
        System.out.println("Student " + student.getName() + " with ID " + student.getStudentId() + " created.");
    }

    public Student createStudent(String name, String studentId) {
        return new Student(name, studentId);
    }
}

 */
