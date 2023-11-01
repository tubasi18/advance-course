package assignment1.Interfaces;

import java.util.List;

public interface ICourse {
    public String getCourseCode();
    public String getTitle();
    public String getInstructor();
    public int getMaxCapacity();
    public List<IStudent> getEnrolledStudents();
    public int getSizeCurrentEnrollment();
    public void setCourseCode(String courseCode);
    public void setTitle(String title);
    public void setInstructor(String instructor);
    public void setCapacity(int capacity);
    public void enrollStudent(IStudent student);
    public void dropStudent(IStudent student);
    public boolean isFull() ;

}
