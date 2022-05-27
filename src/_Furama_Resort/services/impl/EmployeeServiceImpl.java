package _Furama_Resort.services.impl;

import _Furama_Resort.models.persons.Employee;
import _Furama_Resort.services.service.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private static List<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    static {
        employeeList.add(new Employee(111, "Kakarot", 18, "Male", 563, 789123, "kakarot@gmail.com", "kkr563", "University", "Manager", 6000));
        employeeList.add(new Employee(222, "Chichi", 17, "Female", 798, 564321, "chichi@gmail.com", "ch145", "Colleges", "Monitor", 5400));
        employeeList.add(new Employee(212, "Gohan", 16, "Male", 632, 452397, "gohan@gmail.com", "gh178", "University", "Management", 5700));
    }

    @Override
    public void displayListEmployee() {
        System.out.println("List Employee: ");
        for (Employee item : employeeList) {
            System.out.println(item);
        }
    }

    @Override
    public void addNewEmployee() {
        System.out.println("Enter Name Employee: ");
        String name = scanner.nextLine();
        System.out.println("Enter Birth Employee: ");
        int birth = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Gender Employee: 1. Male; 2. Female; 3. Other Genders.");
        String gender;
        int isGender;
        do {
            isGender = Integer.parseInt(scanner.nextLine());
            switch (isGender) {
                case 1:
                    gender = "Male.";
                    break;
                case 2:
                    gender = "Female.";
                    break;
                case 3:
                    gender = "Other Genders.";
                    break;
                default:
                    gender = "Error: Enter Again.. (1 -> 4)";
                    break;
            }
        } while (isGender < 1 || isGender > 3);
        System.out.println("Enter ID Employee: ");
        int idCard = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Phone Number Employee: ");
        int phoneNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Email Employee: ");
        String email = scanner.nextLine();
        System.out.println("Enter Id Employee: ");
        String employeeId = scanner.nextLine();
        System.out.println("Enter Level Employee: 1. Intermediate; 2. Colleges; 3. University; 4. After University.");
        String level;
        int chooseLevel;
        do {
            chooseLevel = Integer.parseInt(scanner.nextLine());
            switch (chooseLevel) {
                case 1:
                    level = "Intermediate.";
                    break;
                case 2:
                    level = "Colleges.";
                    break;
                case 3:
                    level = "University.";
                    break;
                case 4:
                    level = "After University.";
                    break;
                default:
                    level = "Error: Enter Again.. (1 -> 4)";
                    break;
            }
        } while (chooseLevel < 1 || chooseLevel > 4);
        System.out.println("Enter Position Employee: 1. Receptionist; 2. Server; 3. Specialist; 4. Monitor; 5. Management; 6. Manager.");
        String position;
        int choosePos;
        do {
            choosePos = Integer.parseInt(scanner.nextLine());
            switch (choosePos) {
                case 1:
                    position = "Receptionist.";
                    break;
                case 2:
                    position = "Server.";
                    break;
                case 3:
                    position = "Specialist.";
                    break;
                case 4:
                    position = "Monitor.";
                    break;
                case 5:
                    position = "Management.";
                    break;
                case 6:
                    position = "Manager.";
                    break;
                default:
                    position = "Error: Enter Again.. (1 -> 6).";
                    break;
            }
        } while (choosePos < 1 || choosePos > 6);
        System.out.println("Enter Salary Employee: ");
        int salary = Integer.parseInt(scanner.nextLine());
        int id = employeeList.get(employeeList.size() - 1).getId() + 1;
        Employee employee = new Employee(id, name, birth, gender, idCard, phoneNumber, email, employeeId, level, position, salary);
        employeeList.add(employee);
        System.out.println("Added Employee Success.");
    }

    @Override
    public void editEmployeebyId() {
        int countEdit = 0;
        System.out.println("Enter ID Employee want to Update: ");
        int inputUpdate = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId() == inputUpdate) {
                System.out.println("Enter Name Employee: ");
                String name = scanner.nextLine();
                System.out.println("Enter Birth Employee: ");
                int birth = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter Gender Employee: 1. Male; 2. Female; 3. Other Genders.");
                String gender;
                int isGender;
                do {
                    isGender = Integer.parseInt(scanner.nextLine());
                    switch (isGender) {
                        case 1:
                            gender = "Male.";
                            break;
                        case 2:
                            gender = "Female.";
                            break;
                        case 3:
                            gender = "Other Genders.";
                            break;
                        default:
                            gender = "Error: Enter Again.. (1 -> 4)";
                            break;
                    }
                } while (isGender < 1 || isGender > 3);
                System.out.println("Enter ID Employee: ");
                int idCard = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter Phone Number Employee: ");
                int phoneNumber = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter Email Employee: ");
                String email = scanner.nextLine();
                System.out.println("Enter Id Employee: ");
                String employeeId = scanner.nextLine();
                System.out.println("Enter Level Employee: 1. Intermediate; 2. Colleges; 3. University; 4. After University.");
                String level;
                int chooseLevel;
                do {
                    chooseLevel = Integer.parseInt(scanner.nextLine());
                    switch (chooseLevel) {
                        case 1:
                            level = "Intermediate.";
                            break;
                        case 2:
                            level = "Colleges.";
                            break;
                        case 3:
                            level = "University.";
                            break;
                        case 4:
                            level = "After University.";
                            break;
                        default:
                            level = "Error: Enter Again.. (1 -> 4)";
                            break;
                    }
                } while (chooseLevel < 1 || chooseLevel > 4);
                System.out.println("Enter Position Employee: 1. Receptionist; 2. Server; 3. Specialist; 4. Monitor; 5. Management; 6. Manager.");
                String position;
                int choosePos;
                do {
                    choosePos = Integer.parseInt(scanner.nextLine());
                    switch (choosePos) {
                        case 1:
                            position = "Receptionist.";
                            break;
                        case 2:
                            position = "Server.";
                            break;
                        case 3:
                            position = "Specialist.";
                            break;
                        case 4:
                            position = "Monitor.";
                            break;
                        case 5:
                            position = "Management.";
                            break;
                        case 6:
                            position = "Manager.";
                            break;
                        default:
                            position = "Error: Enter Again.. (1 -> 6).";
                            break;
                    }
                } while (choosePos < 1 || choosePos > 6);
                System.out.println("Enter Salary Employee: ");
                int salary = Integer.parseInt(scanner.nextLine());
                int id = employeeList.get(employeeList.size() - 1).getId();
                Employee employee = new Employee(id, name, birth, gender, idCard, phoneNumber, email, employeeId, level, position, salary);
                employeeList.set(i, employee);
                countEdit++;
                System.out.println("Edited Employee Success.");
            }
        }
        if (countEdit == 0) {
            System.out.println("ID NOT found!!");
        }
    }
}
//
//    @Override
//    public void deleteEmployeeById() {
//        System.out.println("Enter ID Employee want to Delete: ");
//        int inputRemove = Integer.parseInt(scanner.nextLine());
//        for (int i = 0; i < employeeList.size(); i++) {
//            if (employeeList.get(i).getId() == inputRemove) {
//                for (int j = i + 1; j < employeeList.size(); j++) {
//                    employeeList.remove(employeeList.get(i));
//                    break;
//                }
//                System.out.println("Deleted Employee Success.");
//                inputRemove++;
//            }
//        }
//        if (inputRemove == 0)
//            System.out.println("ID NOT found!!");
//    }