package assignment1;

import assignment1.Implementations.Course;
import assignment1.Implementations.Student;
import assignment1.Implementations.University;

public class Main {
    public static void main(String[] args) {

        University university = new University();

        Student student1 = new Student(1, "Maher", "maher@gmail.com");
        Student student2 = new Student(2, "Mohammed", "mohmmad@gmail.com");
        Student student3 = new Student(3, "Suhad", "motna@gmail.com");
        Student student4 = new Student(4, "Adnan", "Aseel@gmail.com");
        Student student5 = new Student(5, "Aya", "Aya@gmail.com");
        Student student6 = new Student(6, "Noor", "Noor@gmail.com");


        Course course1 = new Course("10672307", "Advanced topics in software construction", "Dr. Mustafa", 10);
        Course course2 = new Course("10672205", "Software engineering and communication", "Dr. Mustafa", 10);
        Course course3 = new Course("10672333", "Big data engineering", "Dr. Hamid", 10);
        Course course4 = new Course("10672358", "Software project management", "Dr. Maher", 10);


        university.addStudent(student1);
        university.addStudent(student2);
        university.addStudent(student3);
        university.addStudent(student4);
        university.addStudent(student5);
        university.addStudent(student6);
        university.addCourse(course1);
        university.addCourse(course2);
        university.addCourse(course3);
        university.addCourse(course4);

        try {
            university.enrollStudentInCourse(1, "10672307");
            university.enrollStudentInCourse(1, "10672333");
            university.enrollStudentInCourse(1, "10672358");
            university.enrollStudentInCourse(1, "10672205");

            university.enrollStudentInCourse(2, "10672307");
            university.enrollStudentInCourse(2, "10672333");
            university.enrollStudentInCourse(2, "10672358");
            university.enrollStudentInCourse(2, "10672205");

            university.enrollStudentInCourse(3, "10672307");
            university.enrollStudentInCourse(3, "10672333");
            university.enrollStudentInCourse(3, "10672358");
            university.enrollStudentInCourse(3, "10672205");

            university.enrollStudentInCourse(4, "10672307");
            university.enrollStudentInCourse(4, "10672333");
            university.enrollStudentInCourse(4, "10672358");
            university.enrollStudentInCourse(4, "10672205");

            university.dropCourseFromStudent(1,"10672307");
            university.dropCourseFromStudent(1,"10672333");
            university.dropCourseFromStudent(1,"10672358");
            university.dropCourseFromStudent(1,"10672205");

            university.enrollStudentInCourse(6, "10672307");
            university.enrollStudentInCourse(6, "10672333");
            university.enrollStudentInCourse(6, "10672358");
            university.enrollStudentInCourse(6, "10672205");

            university.generateReports("10672307",6);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }






    }

}