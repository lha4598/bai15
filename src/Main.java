
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Faculty> faculties = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.Nhập");
            System.out.println("2.Hiển thị tất cả");
            System.out.println("3.Lấy điểm TB của sinh viên theo học kì");
            System.out.println("4.Tổng số sv chính quy của khoa");
            System.out.println("5.Sv có đầu vào cao nhất ở mỗi khoa");
            System.out.println("6.Tìm sv tại chức thoe nơi đào tạo");
            System.out.println("7.Tìm sv có điểm > 8.0 tại học kì gần nhất");
            System.out.println("8.tìm sv có điểm tb học kì cao nhất");
            System.out.println("9.Sắp xếp sv theo năm vào học");
            System.out.println("10.Thống kê sl sv theo năm và học");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("1.Nhập khoa mới");
                    System.out.println("2.Chọn khoa có sẵn");
                    int khoa = sc.nextInt();
                    sc.nextLine();
                    if (khoa == 1) {
                        System.out.println("Nhập tên khoa: ");
                        String facultyName = sc.nextLine();
                        Faculty faculty = new Faculty(facultyName);
                        addStudent();
                        faculties.add(faculty);
                    }
                    if (khoa == 2) {
                        for (Faculty faculty : faculties) {
                            System.out.println(faculty.getName());
                        }
                        String s = sc.nextLine();
                        if (s.equals(faculties.getFirst().getName())) {
                            addStudent();
                        } else {
                            return;
                        }

                    }
                    break;
                case 2:
                    showAllFaculty();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
            }
        }

    }
    public static void addStudent() {
        Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        System.out.println("Student Type:");
        System.out.println("1. Regular Student");
        System.out.println("2. In-service Student");
        int choice = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập id");
        String id = sc.nextLine();

        System.out.println("Nhập tên: ");
        String name = sc.nextLine();

        System.out.println("Nhập NTNS");
        String doB = sc.nextLine();

        System.out.println("Nhập năm bắt đầu:");
        int admissionYear = sc.nextInt();

        System.out.println("Nhập điểm đầu vào: ");
        double entryScore = sc.nextDouble();
        sc.nextLine();

        List<LearningResult> learningResults = new ArrayList<>();
        System.out.println("Nhập số kì học: ");
        int soKi = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < soKi; i++) {
            System.out.println("Nhập kì học: ");
            String semesterName = sc.nextLine();
            System.out.println("Nhập điểm TB: ");
            double semesterScore = sc.nextDouble();
            sc.nextLine();
            LearningResult lr = new LearningResult(semesterName, semesterScore);
            learningResults.add(lr);
        }

        Student student = null;
        switch (choice) {
            case 1:
                student = new RegularStudent(id, name, doB, admissionYear, entryScore, learningResults);

                break;
            case 2:
                System.out.println("Nhập nơi đào tạo: ");
                String trainingPlace = sc.nextLine();
                student = new InserviceStudent(id, name, doB, admissionYear, entryScore, learningResults, trainingPlace);

                break;
            default:
                System.out.println("Nhập lỗi");
        }
        students.add(student);
        System.out.println("01 sinh viên đã thêm vào hệ thống ");
    }

    public static void showAllFaculty() {
        for (Faculty faculty : faculties) {
            System.out.println(faculty);
        }
    }

    public static void addFaculty() {
        Scanner sc = new Scanner(System.in);

    }

}