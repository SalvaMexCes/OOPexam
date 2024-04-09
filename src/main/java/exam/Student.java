package exam;

public class Student extends Customer {

    public static long studentID;
    final private double DISCOUNT= 0.05;
    public static int uniqueID = 0;


    public Student(String name, Size size) {
        super(name, size);
        this.studentID = studentID;
    }

    public void printUniqueStudentID(){
        uniqueID++;
        studentID = uniqueID;
        System.out.println("Student ID: " + studentID);
    }

}
