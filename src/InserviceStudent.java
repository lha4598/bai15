import java.util.List;

public class InserviceStudent extends Student {
    private String trainingPlace;

    public InserviceStudent() {

    }

    public InserviceStudent(String id, String name, String doB, int admissionYear, double entryScore, List<LearningResult> learningResults, String trainingPlace) {
        super(id, name, doB, admissionYear, entryScore, learningResults);
        this.trainingPlace = trainingPlace;
    }

    public String getTrainingPlace() {
        return trainingPlace;
    }

    public void setTrainingPlace(String trainingPlace) {
        this.trainingPlace = trainingPlace;
    }

    @Override
    public String toString() {
        return super.toString() + "trainingPlace=" + trainingPlace + '}';
    }
}
