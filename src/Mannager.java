import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mannager {
    private List<Faculty> facultyList;

    public Mannager() {
        facultyList = new ArrayList<Faculty>();
    }


    public void showStudent() {
        facultyList.forEach(faculty -> System.out.println(faculty.toString()));
    }

    @Override
    public String toString() {
        return "Mannager{" +
                "facultyList=" + facultyList +
                '}';
    }
}
