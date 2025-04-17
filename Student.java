public class Student extends Person {
    private String idNum;  // Student ID number
    private double gpa;    // Grade point average

    
    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender);  // parent class constructor
        this.idNum = idNum;
        this.gpa = gpa;
    }

    // Getter 
    public String getIdNum() {
        return idNum;
    }

    public double getGPA() {
        return gpa;
    }

    // Setter 
    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public void setGPA(double gpa) {
        this.gpa = gpa;
    }

    // Simple toString method
    public String toString() {
        return getName() + ", ID: " + idNum + ", GPA: " + gpa;
    }
}

