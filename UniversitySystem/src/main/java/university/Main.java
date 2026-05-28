package university;
import university.entities.*;
import university.services.UniversityService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UniversityService service = new UniversityService();
        service.addStudent(new Student("Олексій", "olex@i.ua", 2026));
        service.addTeacher(new Teacher("Іван Петрович"));

        service.showAll();
    }
}