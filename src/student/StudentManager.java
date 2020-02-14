package student;

import student.SortStudentById;
import student.SortStudentByName;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class StudentManager {
    Scanner input = new Scanner(System.in);
    List<Student> students = new ArrayList<Student>();

    public int inputStudentId() {
        System.out.println("Enter student id: ");
        while (true){
            try {
                int id = Integer.parseInt(input.nextLine());
                return id;
            }catch (Exception e){
                System.out.println("invalid! Input student id again: ");
            }
        }
    }

    public String intputStudentName() {
        input.nextLine();
        System.out.println("Enter student name: ");
        return input.nextLine();
    }

    public String inputStudentGender() {
        System.out.println("Enter student gender: ");
        return input.nextLine();
    }

    public int inputStudentAge() {
        System.out.println("Enter student age: ");
        while (true){
            try {
                int age = Integer.parseInt(input.nextLine());
                if (age < 0 && age > 100) {
                    throw new NumberFormatException();
                }
                return age;
            }catch (NumberFormatException e){
                System.out.println("invalid! Input student id again: ");
            }
        }
    }

    public void addStudent() {
        int id = inputStudentId();
        String name = intputStudentName();
        String gender = inputStudentGender();
        int age = inputStudentAge();
        Student student = new Student(id, name, gender, age);
        students.add(student);
        System.out.println("Add success");
    }

    public void editStudent(){
        System.out.println("1. Edit By Id ");
        System.out.println("2. Edit By Name ");
        int choice = input.nextInt();
        boolean isExisted = false;
        switch (choice){
            case 1:
                System.out.println("Enter id need edit: ");
                int id = input.nextInt();
                int size = students.size();
                for (int i = 0;i<size;i++) {
                    if (students.get(i).getId() == id) {
                        isExisted = true;
                        students.get(i).setId(inputStudentId());
                        students.get(i).setStudentName(intputStudentName());
                        students.get(i).setGender(inputStudentGender());
                        students.get(i).setAge(inputStudentAge());
                        System.out.println("Edit success");
                    }
                }
                if (isExisted == false) {
                    System.out.printf("id = %d not existed.\n", id);
                }
                break;
            case 2:
                input.nextLine();
                System.out.println("Enter name need edit: ");
                String studentName =input.nextLine();
                for (int i = 0;i<students.size();i++) {
                    if (students.get(i).getStudentName().equals(studentName)) {
                        students.get(i).setId(inputStudentId());
                        students.get(i).setStudentName(intputStudentName());
                        students.get(i).setGender(inputStudentGender());
                        students.get(i).setAge(inputStudentAge());
                        System.out.println("Edit success");
                    }else {
                        System.out.println("student id not existed");
                    }
                }
                break;
        }
    }

    public void deleteStudent(){
        System.out.println("1. Delete By Id ");
        System.out.println("2. Delete By Name ");
        int choice = input.nextInt();
        boolean isExisted = false;
        switch (choice){
            case 1:
                System.out.println("Enter id need delete: ");
                int id = input.nextInt();
                for (Student student : students) {
                    if (student.getId() == id) {
                        isExisted = true;
                        System.out.println("Delete success");
                    }
                }
                if (isExisted == false) {
                            System.out.printf("id = %d not existed.\n", id);
                        }
                break;
            case 2:
                input.nextLine();
                System.out.println("Enter name need delete: ");
                String studentName =input.nextLine();
                for (Student student : students) {
                    if (student.getStudentName().equals(studentName)) {
                        System.out.println("Delete success");
                    }else {
                        System.out.println("student id not existed");
                    }
                }
                break;
        }
    }

    public void sortStudent(){
        System.out.println("1. Sort By Id");
        System.out.println("2. Sort By Name");
        int choice=input.nextInt();
        switch (choice){
            case 1:
                Collections.sort(students, new SortStudentByName());
                for (Student student : students) {
                    System.out.println(student.toString());
                }
                break;
            case 2:
                Collections.sort(students, new SortStudentById());
                for (Student student : students) {
                    System.out.println(student.toString());
                }
                break;
        }

    }

    public void searchStudent(){
        System.out.println("1. Search By Id ");
        System.out.println("2. Search By Name ");
        int choice = input.nextInt();
        boolean isExisted = false;
        switch (choice){
            case 1:
                System.out.println("Enter id need find: ");
                int id = input.nextInt();
                for (Student student : students) {
                    if (student.getId() == id) {
                        isExisted = true;
                        System.out.println(students.toString());
                    }
                }
                if (isExisted==false) {
                        System.out.printf("id = %d not existed.\n", id);
                    }
                break;
            case 2:
                input.nextLine();
                System.out.println("Enter name need find: ");
                String studentName =input.nextLine();
                for (Student student : students) {
                    if (student.getStudentName().equals(studentName)) {
                        System.out.println(student.toString());
                    }else {
                        System.out.println("Not found");
                    }
                }
                break;
        }
    }

    public void showStudentList(){
            for (Student student : students) {
                System.out.println(student.toString());
            }
        }
    }




