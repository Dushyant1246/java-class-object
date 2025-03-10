public class Student {

    // Fields
    private String name;
    private  String rollNumber;
    private int marks;

    // Constructor
    Student(String name, String rollNumber, int marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to find grade according to marks
    public String getGrade(){
        if (this.marks >= 80) {
            return "A";
        } else if (this.marks >= 70) {
            return "B";
        } else if (this.marks >= 60) {
            return "C";
        } else if (this.marks >= 50) {
            return "D";
        } else if (this.marks >= 40) {
            return "E";
        } else {
            return "R";
        }
    }

    // Method to display student details and grade
    public void displayDetails(){
        System.out.println("Name: " + this.name);
        System.out.println("Roll No.: " + this.rollNumber);
        System.out.println("Marks: " + this.marks);
        System.out.println("Grade: " + this.getGrade());
    }
}
/*
Student student = new Student("Dushyant", "1234", 77);
student.displayDetails();

Name: Dushyant
Roll No.: 1234
Marks: 77
Grade: B
 */