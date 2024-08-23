import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Faculty {
    private String name;
    private List<Student> students;

    public Faculty() {
        students = new ArrayList<Student>();
    }

    public Faculty(String name) {
        this.name = name;
        students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Khoa: " + name + "\n");
        for (Student student : students) {
            sb.append(student.toString()).append("\n");
        }
        return sb.toString();
    }
}
