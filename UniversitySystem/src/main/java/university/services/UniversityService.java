package university.services;

import university.entities.*;
import java.util.ArrayList;
import java.util.List;

public class UniversityService {
    private List<Student> students = new ArrayList<>();
    private List<Teacher> teachers = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();

    public void addStudent(Student s) { students.add(s); }
    public void addTeacher(Teacher t) { teachers.add(t); }
    public void addCourse(Course c) { courses.add(c); }

    public void showAll() {
        System.out.println("--- Студенти ---");
        for (Student s : students) s.printInfo();
        System.out.println("--- Вчителі ---");
        for (Teacher t : teachers) t.printInfo();
        System.out.println("--- Курси ---");
        for (Course c : courses) c.printInfo();
    }
}