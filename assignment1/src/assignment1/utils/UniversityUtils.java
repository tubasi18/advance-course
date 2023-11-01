package assignment1.utils;

import assignment1.Interfaces.ICourse;
import assignment1.Interfaces.IStudent;

public class UniversityUtils {
    public static void enrollStudentInCourse(IStudent student, ICourse course) throws Exception {
        if(student == null){
            throw new Exception("The student  not found ");
        }
        else if(course == null ){
            throw new Exception("The course not found");
        }
        else if(course.isFull()){
            throw new Exception("The Course is Full ");
        }
        student.enrollCourse(course);
    }
    public static void dropCourseFromStudent(IStudent student, ICourse course)throws Exception {
        if(student == null){
            throw new Exception("The student  not found ");
        }
        else if(course == null){
            throw new Exception("The course not found");

        }
        else
            student.dropCourse(course);
    }
}
