package university.entities;
import university.InfoPrintable;

public class Student extends Person implements InfoPrintable {
    private int studyYear;
    public Student(String name, String email, int studyYear) {
        super(name, email);
        this.studyYear = studyYear;
    }
    @Override
    public void printInfo() {
        System.out.println("Студент: " + getName() + " | Рік: " + studyYear);
    }
}
