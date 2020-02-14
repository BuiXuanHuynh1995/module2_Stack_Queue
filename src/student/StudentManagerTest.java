package student;

import student.StudentManager;

import java.util.Scanner;

public class StudentManagerTest {
    public static void showMenu() {
        System.out.println("-----------menu------------");
        System.out.println("1. Add student.");
        System.out.println("2. Delete student");
        System.out.println("3. Search student");
        System.out.println("4. Sort student");
        System.out.println("5. Show student.");
        System.out.println("6. Exit student.");
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager =new StudentManager();
        boolean exit=false;
        showMenu();
        while (true){
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    studentManager.addStudent();
                    break;
                case 2:
                    studentManager.deleteStudent();
                    break;
                case 3:
                    studentManager.searchStudent();
                    break;
                case 4:
                    studentManager.sortStudent();
                    break;
                case 5:
                    studentManager.showStudentList();
                    break;
                case 6:
                    studentManager.editStudent();
                    break;
                case 0:
                    System.exit(0);
            }
            showMenu();
        }
    }
}
