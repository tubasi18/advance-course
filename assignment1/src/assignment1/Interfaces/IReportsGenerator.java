package assignment1.Interfaces;
import java.util.List;

public interface IReportsGenerator {
    void generateAvailableCoursesReport(List<ICourse> courses);
    void generateStudentCoursesReport(IStudent student);
    void generateCourseStudentsReport(ICourse course) ;
}
