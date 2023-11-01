package assignment1.Implementations;

import assignment1.Interfaces.ICourse;
import assignment1.Interfaces.IStudent;
import assignment1.utils.UniversityUtils;

import java.util.ArrayList;
import java.util.List;

public class University {
    private final List<IStudent> students;
    private final List<ICourse> courses;
    private final ReportsGenerator reports;

    public  University() {
        students = new ArrayList<>();
        courses = new ArrayList<>();
        reports = new ReportsGenerator();
    }
    public List<IStudent> getStudents() {
        return students;
    }
    public List<ICourse> getCourses() {
        return courses;
    }
    public void addStudent(IStudent student) {students.add(student);
    }
    public void addCourse(ICourse course) {
        courses.add(course);
    }
    private IStudent findStudentById(int id) throws Exception {
        for (IStudent student : students) {
            if (student.getStudentId() == id) {
                return student;
            }
        }
        throw new Exception("The Student  with id "+ id + " not found");
    }
    private ICourse findCourseById(String courseCode)throws Exception {
        for (ICourse course : courses) {
            if (course.getCourseCode().equals(courseCode)) {
                return course;
            }
        }
        throw new Exception("The Course Code "+ courseCode + " not found");
    }
    public  void enrollStudentInCourse(int id, String courseCode) throws Exception{
        IStudent student = findStudentById(id);
        ICourse course = findCourseById(courseCode);
        UniversityUtils.enrollStudentInCourse(student,course);
    }
    public void dropCourseFromStudent(int id, String courseCode)throws Exception {

        IStudent student = findStudentById(id);
        ICourse course = findCourseById(courseCode);
        UniversityUtils.dropCourseFromStudent(student,course);
    }
    public void generateReports(String courseCode , int id)throws Exception {
        IStudent student = findStudentById(id);
        ICourse course = findCourseById(courseCode);
        reports.generateAvailableCoursesReport(getCourses());
        reports.generateStudentCoursesReport(student);
        reports.generateCourseStudentsReport(course);
    }
}