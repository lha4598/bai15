public class LearningResult {
    private String semesterName;
    private double semesterScore;

    public LearningResult() {

    }

    public LearningResult(String semesterName, double semesterScore) {
        this.semesterName = semesterName;
        this.semesterScore = semesterScore;
    }

    public String getSemesterName() {
        return semesterName;
    }

    public void setSemesterName(String semesterName) {
        this.semesterName = semesterName;
    }

    public double getSemesterScore() {
        return semesterScore;
    }

    public void setSemesterScore(double semesterScore) {
        this.semesterScore = semesterScore;
    }

    @Override
    public String toString() {
        return "LearningResult{" +
                "semesterName='" + semesterName + '\'' +
                ", semesterScore=" + semesterScore +
                '}';
    }
}
