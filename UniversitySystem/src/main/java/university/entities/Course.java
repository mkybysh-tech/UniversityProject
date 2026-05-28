package university.entities;

import university.InfoPrintable;

public class Course implements InfoPrintable {
    private String courseName;
    private CourseType type;

    public Course(String courseName, CourseType type) {
        this.courseName = courseName;
        this.type = type;
    }

    @Override
    public void printInfo() {
        System.out.println("Курс: " + courseName + " [" + type + "]");
    }
}
