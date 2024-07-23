package Exercise25;

public class Student {
    private int id;
    private String name;
    private double subject1;
    private double subject2;
    private double subject3;

    public Student() {
        this.id = 0;
        this.name = "";
        this.subject1 = 0.0;
        this.subject2 = 0.0;
        this.subject3 = 0.0;
    }

    public Student(int id, String name, double subject1, double subject2, double subject3) {
        this.id = id;
        this.name = name;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSubject1() {
        return subject1;
    }

    public void setSubject1(double subject1) {
        this.subject1 = subject1;
    }

    public double getSubject2() {
        return subject2;
    }

    public void setSubject2(double subject2) {
        this.subject2 = subject2;
    }

    public double getSubject3() {
        return subject3;
    }

    public void setSubject3(double subject3) {
        this.subject3 = subject3;
    }

    public double calculateAverage() {
        return (subject1 + subject2 + subject3) / 3;
    }

    @Override
    public String toString() {
        double average = calculateAverage();
        return String.format("%-5d%-20s%-15.2f%-15.2f%-15.2f%-15.2f", id, name, subject1, subject2, subject3, average);
    }
}