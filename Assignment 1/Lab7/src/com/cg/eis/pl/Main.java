package com.cg.eis.pl;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeServicesimpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean isContinue = true;
        HashMap<String, Employee> employeeHashMap = new HashMap<>();
        EmployeeServicesimpl insuranceImpl = new EmployeeServicesimpl();


        while(isContinue){
            System.out.println("Choose from the following:");
            System.out.println("1. Register Employee");
            System.out.println("2. Get Employee Details");
            System.out.println("3. Delete Employee Details");
            System.out.println("4. Quit");
            System.out.println();

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            if(choice == 1){
                System.out.println("Enter Id");
                String id = sc.next();
                sc.nextLine();
                System.out.println("Enter Employee Name");
                String name = sc.nextLine();
                System.out.println("Enter Employee Salary");
                double salary = sc.nextDouble();
                sc.nextLine();
                System.out.println("Enter Employee Designation");
                String desg = sc.nextLine();
                Employee employee = new Employee(id,name,salary,desg);
                employee.setInsuranceScheme(insuranceImpl.getInsurance(employee));
                employeeHashMap.put(id,employee);
            }
            else if(choice == 2){
                List<Employee> employeeList = new ArrayList<>();
                sc.nextLine();
                System.out.println("Enter Insurace Scheme");
                String insuranceScheme = sc.nextLine();
                employeeList = getEmployeeList(employeeHashMap, insuranceScheme);
                System.out.println("Id              Name            Salary          Designation         Insurance");
                System.out.println();
                for(Employee emp: employeeList){
                    System.out.println(emp.getId()+"        "+emp.getName()+"       "+emp.getSalary()+"     "+emp.getDesignation()+"        "+emp.getInsuranceScheme());
                }
            }

            else if(choice == 3){
                System.out.println("Enter Id to delete employee Details");
                String deletingId = sc.next();
                int count = 0;
                for (String id: employeeHashMap.keySet()){
                    if(id.equals(deletingId)){
                        employeeHashMap.remove(id);
                        count ++ ;
                    }
                }
                if(count == 0){
                    System.out.println("No Such Id Found");
                }
            }

            else if(choice == 4){
                isContinue = false;
            }

        }
    }

    private static List<Employee> getEmployeeList(HashMap<String, Employee> employeeHashMap, String insuranceScheme) {
        ArrayList<Employee> totalList = new ArrayList<>(employeeHashMap.values());
        List<Employee> matchedEmployees = new ArrayList<>();
        for(Employee emp: totalList){
            if(emp.getInsuranceScheme().equals(insuranceScheme)){
                matchedEmployees.add(emp);
            }
        }
        return matchedEmployees;
    }
}
