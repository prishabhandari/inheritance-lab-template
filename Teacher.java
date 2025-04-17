public class Teacher extends Person {
    private String subject;  // subject the teacher teaches
    private double salary;   // teacher's salary

    // constructor
    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);  // inherit properties from Person
        this.subject = subject;
        this.salary = salary;
    }

    // Getter
    public String getSubject() {
        return subject;
    }

    public double getSalary() {
        return salary;
    }

    // Setter
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Simple toString method
    public String toString() {
        return getName() + ", teaches: " + subject + ", salary: " + salary;
    }
}

