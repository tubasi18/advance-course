package assignment1.Implementations;

import assignment1.Interfaces.ICourse;
import assignment1.Interfaces.IReportsGenerator;
import assignment1.Interfaces.IStudent;
import java.util.List;
public class ReportsGenerator implements IReportsGenerator {
    public void generateAvailableCoursesReport(List<ICourse> courses) {
        System.out.println("Available Courses : ");
        for (ICourse course : courses) {
            int freeSeats = course.getMaxCapacity() - course.getSizeCurrentEnrollment();
            if (freeSeats > 0) {

                System.out.println("-> Course Code: " + course.getCourseCode() + " , Title: " + course.getTitle() + ", Free Seats: " + freeSeats);
            }
        }
        System.out.println();
    }
    public void generateStudentCoursesReport(IStudent student) {
        if (student == null) {
            System.out.println("The Student is not found in the University.");
            return;
        }
        if (student.getEnrolledCourses().isEmpty()) {
            System.out.println("No courses are currently enrolled by this student.");}
        else {
            System.out.println("Courses enrolled by " + student.getName() + " :");
            for (ICourse course : student.getEnrolledCourses()) {
                System.out.println("-> Course Code: " + course.getCourseCode() + " , Title: " + course.getTitle());
            }
        }
        System.out.println();
    }
    public void generateCourseStudentsReport(ICourse course) {
        if(course == null){
            System.out.println("The Course you entered is not valid.");
            return;
        }
        System.out.println("Students Enrolled in " + course.getTitle() + " :");
        if (course.getEnrolledStudents().isEmpty()) {
            System.out.println("No students are currently enrolled in this course.");
        }
        for (IStudent student : course.getEnrolledStudents()) {
            System.out.println("-> Id: " + student.getStudentId() + " , Name: " + student.getName() + " , Email: " + student.getEmail());
        }
        System.out.println();
    }
}

