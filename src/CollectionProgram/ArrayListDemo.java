package CollectionProgram;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    static ArrayList<Student> ar1 = new ArrayList<Student>();

    //        Add student
    public static void addStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Adding student");
        System.out.print("Enter student rollno: ");
        int rollno = sc.nextInt();
        System.out.print("Enter the student's name: ");
        String name = sc.next();
        System.out.print("Enter student marks: ");
        int marks = sc.nextInt();

        Student s1 = new Student(name, marks, rollno);

        ar1.add(s1);
        System.out.println("Student added successfully!!!");
    }

//    Displaying the output
    public static void showAllStudents(){
        for(Student std:ar1){
            System.out.println(std);
        }
    }

//    Deleting the data
    public static void deleteTheDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the index: ");
        int index = sc.nextInt();
        ar1.remove(index);
        System.out.println("Removed Successfully!!!");
    }

    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do{
            System.out.println("1. Add Student");
            System.out.println("2. Show all student");
            System.out.println("3. Remove the student");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 1 : addStudent();
                        break;
                case 2 : showAllStudents();
                        break;
                case 3 : deleteTheDetails();
                        break;
            }
        }while(choice!=0);
    }
}
