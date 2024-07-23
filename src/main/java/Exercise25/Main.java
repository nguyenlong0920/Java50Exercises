package Exercise25;

public class Main {
    public static void main(String[] args) {
        // Using the default constructor
        Student student1 = new Student();
        student1.setId(1);
        student1.setName("Bach Ruoi");
        student1.setSubject1(85.5);
        student1.setSubject2(90.0);
        student1.setSubject3(78.5);

        // Using the parameterized constructor
        Student student2 = new Student(2, "Long Nguyen", 99.0, 96.9, 99.6);

        // Creating a student object and setting values individually
        Student student3 = new Student();
        student3.setId(3);
        student3.setName("Hoang Tran");
        student3.setSubject1(82.0);
        student3.setSubject2(86.5);
        student3.setSubject3(91.0);

        // Output the students' information
        System.out.printf("%-5s%-20s%-15s%-15s%-15s%-15s\n", "ID", "Name", "Subject 1" , "Subject 2", "Subject 3", "Average");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }
}
