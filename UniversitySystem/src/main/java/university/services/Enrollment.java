package university.services;

import university.entities.Student;
import university.entities.Course;

public class Enrollment {
    private Student student;
    private Course course;

    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
    }
}
