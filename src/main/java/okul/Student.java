package okul;

public class Student {

    private String studentFirstName;
    private String studentLastName;
    private String studentId;
    private Integer studentAge;

    public Student(String studentFirstName, String studentLastName, String studentId, Integer studentAge) {
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.studentId = studentId;
        this.studentAge = studentAge;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Integer getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(Integer studentAge) {
        this.studentAge = studentAge;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentFirstName='" + studentFirstName + '\'' +
                ", studentLastName='" + studentLastName + '\'' +
                ", studentId='" + studentId + '\'' +
                ", studentAge='" + studentAge + '\'' +
                '}';
    }



}
