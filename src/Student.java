import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Student {
    protected String id;
    protected String name;
    protected String doB;
    protected int admissionYear;
    protected double entryScore;
    protected List<LearningResult> learningResults;

    public Student() {
        this.learningResults = new ArrayList<LearningResult>();
    }

    public Student(String id, String name, String doB, int admissionYear, double entryScore, List<LearningResult> learningResults) {
        this.id = id;
        this.name = name;
        this.doB = doB;
        this.admissionYear = admissionYear;
        this.entryScore = entryScore;
        this.learningResults = learningResults;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDoB() {
        return doB;
    }

    public void setDoB(String doB) {
        this.doB = doB;
    }

    public int getAdmissionYear() {
        return admissionYear;
    }

    public void setAdmissionYear(int admissionYear) {
        this.admissionYear = admissionYear;
    }

    public double getEntryScore() {
        return entryScore;
    }

    public void setEntryScore(double entryScore) {
        this.entryScore = entryScore;
    }

    public List<LearningResult> getLearningResults() {
        return learningResults;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(" // " + id + " // " + name + " // " + doB + " // " + admissionYear + " // " + entryScore + "\n");
        for (LearningResult lr : learningResults) {
            sb.append(lr.toString()).append("\n");
        }
        return sb.toString();
    }
}
