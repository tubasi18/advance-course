package assignment1.Implementations;

import assignment1.Interfaces.ICourse;
import assignment1.Interfaces.IStudent;

import java.util.ArrayList;
import java.util.List;
public class Course implements ICourse {
    private  String courseCode;
    private  String title;
    private  String instructor;
    private int capacity;
    private final List<IStudent> enrolledStudents;
    public Course(String courseCode, String title, String instructor, int capacity) {
        this.courseCode = courseCode;
        this.title = title;
        this.instructor = instructor;
        this.capacity = capacity;
        this.enrolledStudents = new ArrayList<>();
    }
    public String getCourseCode() {return courseCode;}
    public String getTitle() {
        return title;
    }
    public String getInstructor() {
        return instructor;
    }
    public int getMaxCapacity() {
        return capacity;
    }
    public List<IStudent> getEnrolledStudents() {return enrolledStudents;}
    public int getSizeCurrentEnrollment() {
        return enrolledStudents.size();
    }
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void enrollStudent(IStudent student) {
        enrolledStudents.add(student);
    }
    public void dropStudent(IStudent student) {enrolledStudents.remove(student);}
    public boolean isFull() {return getSizeCurrentEnrollment() > getMaxCapacity();}
}