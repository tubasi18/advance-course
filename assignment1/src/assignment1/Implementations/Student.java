package assignment1.Implementations;
import assignment1.Interfaces.ICourse;
import assignment1.Interfaces.IStudent;

import java.util.ArrayList;
import java.util.List;

public class Student implements IStudent {
    private int studentId;
    private String name;
    private String email;
    private final List<ICourse> enrolledCourses;
    public Student(int studentId, String name, String email) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.enrolledCourses = new ArrayList<>();
    }
    public int getStudentId() {return studentId;}
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public List<ICourse> getEnrolledCourses() {
        return enrolledCourses;
    }
    @Override
    public void enrollCourse(ICourse course) {
        enrolledCourses.add(course);
        course.enrollStudent(this);
    }
    @Override
    public void dropCourse(ICourse course) {
        enrolledCourses.remove(course);
        course.dropStudent(this);
    }
}

