package courses;

public class CourseManager {
    private CourseCreator creator;

    public CourseManager(CourseCreator creator) {
        this.creator = creator;
    }

    public Course constructOnlineCourse(String courseId, String courseName) {
        return creator.setCourseId(courseId)
                .setCourseName(courseName)
                .setOnline(true)
                .setLocation("Online Platform")
                .build();
    }

    public Course constructOnsiteCourse(String courseId, String courseName, String location) {
        return creator.setCourseId(courseId)
                .setCourseName(courseName)
                .setOnline(false)
                .setLocation(location)
                .build();
    }
}
