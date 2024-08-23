import java.util.List;

public class RegularStudent extends Student {
    public RegularStudent() {

    }

    public RegularStudent(String id, String name, String doB, int admissionYear, double entryScore, List<LearningResult> learningResults) {
        super(id, name, doB, admissionYear, entryScore, learningResults);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
