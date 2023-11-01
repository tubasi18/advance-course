# - Assignment 1 -


## About the project:
- This project aims to create a university system for students .
- The system provided the service of adding students, retrieval of students within the system, and deleting a specific student from the identity.
- Problems in this project , such as coupling or cohesion, and classes depend on  high level not on low level . coupling was solved by creating an interface for each class, such  both the ICourse and IStudent interfaces are examples of abstractions. They define a contract that concrete classes (Course and Student in your case) must adhere to. The use of these interfaces allows for a level of abstraction in your program, making it easier to work with different implementations of courses and students without worrying about specific details and i created some high and low cohesion depending on the behavior functions.

## Information about the added packages and their content:
### There are three packages located inside the package called (Assignment1) :
- Implementations : it contains the class of all  Implementation for classes (Student , Course , ReportsGenerator , University ).
- Interfaces :  are contracts that define a set of methods that a class must implement.
- utils : contains a set of utility classes and functions to provide common functionalities across different classes (UniversityUtils).

![image](https://github.com/tubasi18/Advance-Course/assets/114957621/b69802f2-66f3-4990-bdfa-9cf8c46b6339)



### Part 1: (Student class)
- The student of the class named  "Student", implements the "IStudent" interface and models a student with attributes like ID, name, and email, allowing enrollment and dropping of courses with bidirectional updates between students and courses.
```
public class Student implements IStudent {
    private int studentId;
    private String name;
    private String email;
    private final List<ICourse> enrolledCourses;
}
```

### Part 2: (Course class)
- The course of the class named "Course", implements the "ICourse" interface and represents a course with attributes such as course code, title, instructor, and enrollment details, allowing students to be enrolled or dropped, and checking if the course is at full capacity.
```
public class Course implements ICourse {
    private  String courseCode;
    private  String title;
    private  String instructor;
    private int capacity;
    private final List<IStudent> enrolledStudents;
}
```
### Part 3: (University class)
- The university of the class named  "University", serves as a management system for students and courses, allowing addition of students and courses, handling student enrollment and course dropping, and generating reports through a "ReportsGenerator" for available courses, student enrollments, and course students.
```
public class University {
    private final List<IStudent> students;
    private final List<ICourse> courses;
    private final ReportsGenerator reports;
}
```

### Part 4: (ReportsGenerator class)
- The ReportsGenerator of the class named "ReportsGenerator", implements the "IReportsGenerator" interface and provides methods to generate reports on available courses, courses enrolled by a student, and students enrolled in a course, displaying relevant information for each case.


### Part 5: (UniversityUtils class)
- This utility class, "UniversityUtils", provides static methods for simplifying the enrollment and dropping of courses for students, handling validations for student and course existence, as well as checking if a course has reached its full capacity before performing the operations.
















