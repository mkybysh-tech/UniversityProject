package university.entities;
import university.InfoPrintable;

public class Teacher implements InfoPrintable {
    private String name;
    public Teacher(String name) { this.name = name; }
    @Override
    public void printInfo() { System.out.println("Вчитель: " + name); }
}
