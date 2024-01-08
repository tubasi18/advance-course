# - Assignment 2 -

## About the project: 
- This project aims to create a small application for a company .
- The system has an addition to the staff and manager through the director and through the manager for the staff, and we can calculate the budget for each user in the system through the manager or director.
The director can produce a report for each user in the system .
- This code satisfy the SOLID principles, by creating the classes are created and works depend on the princples.

## Information about the added packages and their content:
### There are five packages located inside the package called (Assignment2) :
![image](https://github.com/tubasi18/AdvanceCourse/assets/114957621/f0c22abf-0f68-46b6-bcd6-307a50003cf9)





### - Single Responsibility Principle (known as SRP)
- I made the Class on SRP, which means each one of them has its own characteristics and features . 
### - Open/Closed Principle
- The Budget_Calculator and Reports_Gentrator classes are designed on factory design pattern to check open-close principle cases and cover it.
- V1:
![image](https://github.com/tubasi18/AdvanceCourse/assets/114957621/fbe6e8d9-7b37-4553-8f45-26478b3554eb)

- V2:
![image](https://github.com/tubasi18/AdvanceCourse/assets/114957621/1c0495b2-f6a6-48fc-84a7-5fb0307cd4ec)


### - The Liskov Substitution Principle (LSP) 
- This class diagram shows the liskov principle, that the relationship and the inheritance are work right.
![image](https://github.com/tubasi18/AdvanceCourse/assets/114957621/2df1f5a5-8e09-43bc-a4c1-f3e74a9e28d2)


### - Dependency Inversion Principle
- The class called (FakeDatabase) was contains objects of concrete class and based mainly on the concrete class(Director, ...), and this fundamentally contradicts our principles, the most important of which is the dependency inversion principle.
![image](https://github.com/tubasi18/AdvanceCourse/assets/114957621/7f4e95e9-9ee0-49cd-aef5-48f2b4fb281e)


# - The class Digram 
![image](https://github.com/tubasi18/AdvanceCourse/assets/114957621/c03c3405-15b7-495b-b24d-9b19935e988b)








