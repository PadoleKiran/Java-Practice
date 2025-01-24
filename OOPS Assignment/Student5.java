import java.util.Scanner;

// Create Student class with age and name. Create 2 objects with dynamic input values.
// Write a static swap function which takes 2 student object parameters and swap the values between object attributes and then display output with swapped value.
import java.util.*;

class Student {
    int age;
    String name;

    Student(){
        System.out.println("This is default class");
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("Age : " + age + " Name : " + name);
    }

    public static void swap(Student student1, Student student2) {
        
        String temp = student1.name;
        student1.name = student2.name;
        student2.name = temp;
        
        int tempage = student1.age;
        student1.age = student2.age;
        student2.age = tempage;

        System.out.println("Swap Variables : ");
        System.out.println("Student1 name : " + student1.name + " and Age : " + student1.age);
        System.out.println("Student1 name : " + student2.name + " and Age : " + student2.age);
    }

    public void disply(){
        System.out.println("Age : " + age + " Name : " + name);
    }
    
}

public class Student5 {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter age for student1 : ");
    int age1 = sc.nextInt();
    System.out.println("Enter name for student1 : ");
    String name1 = sc.next();

    Student student1 = new Student(age1, name1);

    System.out.println("Enter age for student2 : ");
    int age2 = sc.nextInt();
    System.out.println("Enter name for student2 : ");
    String name2 = sc.next();
    Student student2 = new Student(age2,name2);

    Student.swap(student1, student2);
    }
}



// Enter age for student1 : 
// 10
// Enter name for student1 : 
// kiran
// Age : 10 Name : kiran
// Enter age for student2 : 
// 5 kunal
// Enter name for student2 : 
// Age : 5 Name : kunal
// Swap Variables :
// Student1 name : kunal and Age : 5
// Student1 name : kiran and Age : 10