// Create a class Student with following requirements

// Two data members
// age : int
// name : String
// Four constructors
// Default constructor : Should set age to 0 and name to null
// Constructor with int parameter : Should set age to the passed parameter and name to null
// Constructor with String parameter : Should set name to the passed parameter and age to 0
// Constructor with two parameters - int and String : Should set the age to int parameter and name to String parameter
// The assignment code should only be in the 4th constructor. The top 3 constructors should use telescoping to invoke the 4th constructor.

import java.util.Scanner;

class Student {
    private int age;
    private String name;

    Student() {
        int age = 0;
        String name = null;
    }

    Student(int age){
        this.age = age;
    }

    Student(String name){
        this.name = name;
    }

    Student(int age,String name){
        this.age = age;
        this.name = name;
        if(age > 0 && age < 100){
            System.out.println("Name : " + name + " and Age is : " + age);
        } 
        else {
            System.out.print("Please enter valid age !" );
        }
    }
}

class StudentInfo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age : ");
        int age = sc.nextInt();

        System.out.println("Enter name : ");
        String name = sc.next();

        Student student = new Student(age, name);
    }
}