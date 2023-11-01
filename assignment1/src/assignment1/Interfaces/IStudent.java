package assignment1.Interfaces;

import java.util.List;

public interface IStudent  {
    int getStudentId();
    void setStudentId(int studentId);
    String getName();
    void setName(String name);
    String getEmail();
    void setEmail(String email);
    List<ICourse> getEnrolledCourses();
    void enrollCourse(ICourse course);
    void dropCourse(ICourse course);
}