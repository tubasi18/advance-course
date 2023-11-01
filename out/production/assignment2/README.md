# - Assignment 2 -

## About the project: 
- This project aims to create a small application for a company .
- The system has an addition to the staff and manager through the director and through the manager for the staff, and we can calculate the budget for each user in the system through the manager or director.
The director can produce a report for each user in the system .
- This code satisfy the SOLID principles, by creating the classes are created and works depend on the princples.

## Information about the added packages and their content:
### There are five packages located inside the package called (Assignment2) :
![image](https://github.com/tubasi18/Advance-Course/assets/114957621/43066e91-4487-49fa-8e97-6b8610e8dce9)



### - Single Responsibility Principle (known as SRP)
- I made the Class on SRP, which means each one of them has its own characteristics and features . 
### - Open/Closed Principle
- The Budget_Calculator and Reports_Gentrator classes are designed on factory design pattern to check open-close principle cases and cover it.
- V1:
![image](https://github.com/tubasi18/Advance-Course/assets/114957621/da7dbbf4-311e-475e-ac8e-af19869789a6)
- V2:
![image](https://github.com/tubasi18/Advance-Course/assets/114957621/b2c9b3f1-f85e-4f14-a144-a54862559ac1)


### - The Liskov Substitution Principle (LSP) 
- This class diagram shows the liskov principle, that the relationship and the inheritance are work right.
![image](https://github.com/tubasi18/Advance-Course/assets/114957621/4d560147-9c0f-4792-b248-85a48d41c0bc)

### - Dependency Inversion Principle
- The class called (FakeDatabase) was contains objects of concrete class and based mainly on the concrete class(Director, ...), and this fundamentally contradicts our principles, the most important of which is the dependency inversion principle.
![image](https://github.com/tubasi18/Advance-Course/assets/114957621/7786e6de-baaf-4bcd-9183-dd5ef90873d8)

# - The class Digram 
![image](https://github.com/tubasi18/Advance-Course/assets/114957621/8cd69d8e-edec-47d9-9fdb-d3cb66680732)









